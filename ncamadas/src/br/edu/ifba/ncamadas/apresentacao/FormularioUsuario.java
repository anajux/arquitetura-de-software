package br.edu.ifba.ncamadas.apresentacao;

import java.util.Scanner;

import br.edu.ifba.ncamadas.modelo.Usuario;

public class FormularioUsuario implements Formulario<Usuario> {

    @Override
    public Usuario cadastrar() {
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
    
}
