package br.edu.ifba.ncamadas.controle;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifba.ncamadas.modelo.Usuario;

public class ControladorUsuario extends Controlador<Usuario> {

    @Override
    public List<String> listarErros(Usuario entidade) {
        List<String> erros = new ArrayList<>();

        if (!entidade.getEmail().contains("@")) {
            erros.add("e-mail inválido");
        }

        if (entidade.getSenha().length() < 6) {
            erros.add("informe uma senha com mais de 6 caracteres");
        }

        return erros;
    }
    
}
