package br.edu.ifba.mvc.visao;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;
import java.util.Scanner;

import br.edu.ifba.mvc.modelo.Resultado;
import br.edu.ifba.mvc.modelo.Usuario;

public class VisaoUsuarioMock implements Visao<Usuario> {

    @Override
    public Usuario getEntidade() {
        String dados = "ana júlia\naninha.jujuzinha@gmail.com\n090909";
        InputStream entradaSimulada = new ByteArrayInputStream(dados.getBytes());

        Scanner scanner = new Scanner(entradaSimulada);
        Usuario usuario = new Usuario();

        System.out.println("digite seu nome:");
        usuario.setNome(scanner.nextLine());

        System.out.println("digite seu email:");
        usuario.setEmail(scanner.nextLine());

        System.out.println("digite sua senha:");
        usuario.setSenha(scanner.nextLine());

        scanner.close();

        return usuario;
    }

    @Override
    public void atualizar(Resultado resultado, List<String> erros) {
        if (resultado == Resultado.SUCESSO) {
            System.out.println("usuário cadastrado com sucesso!");
        } else {
            System.out.println("ocorreram erros durante o cadastro.");
            for (String erro : erros) {
                System.out.println(erro);
            }
        }
    }

    @Override
    public void atualizar(List<Usuario> entidades) {
        System.out.println("lista de usuários cadastrados.");
        for (Usuario usuario : entidades) {
            System.out.println(usuario);
        }
    }
}