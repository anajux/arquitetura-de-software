package br.edu.ifba.mvc.visao;

import java.util.List;
import java.util.Scanner;

import br.edu.ifba.mvc.modelo.Resultado;
import br.edu.ifba.mvc.modelo.Usuario;

public class VisaoUsuario implements Visao<Usuario>{

    @Override
    public Usuario getEntidade() {
          Scanner scanner = new Scanner(System.in);
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
            for (String erro: erros) {
                System.out.println(erro);
            }
        }
    }

    @Override
    public void atualizar(List<Usuario> entidades) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atualizar'");
    }
    
}
