package br.edu.ifba.mvc.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;

public class ModeloUsuario extends Modelo<Usuario> {

    Map<String, Usuario> usuarios = new TreeMap<>();

    @Override
    public void gravar(Usuario entidade) {
        Resultado resultado = Resultado.SUCESSO;
        List<String> erros = new ArrayList<>();

        if (!entidade.getEmail().contains("@")) {
            erros.add("e-mail inválido");
        }

        if (entidade.getSenha().length() < 6) {
            erros.add("informe uma senha com mais de 6 caracteres");
        }

        if (erros.isEmpty()) {
            String id = UUID.randomUUID().toString();
            entidade.setId(id);
            usuarios.put(id, entidade);
        } else {
            resultado = Resultado.ERRO;
        }

        this.notificar(resultado, erros);

    }

    @Override
    public void listar() {
        this.notificar(new ArrayList<>(usuarios.values()));
    }

}
