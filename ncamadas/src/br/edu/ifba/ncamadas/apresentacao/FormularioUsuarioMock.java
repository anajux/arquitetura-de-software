package br.edu.ifba.ncamadas.apresentacao;

import java.io.InputStream;
import java.util.Scanner;
import java.io.ByteArrayInputStream;

import br.edu.ifba.ncamadas.modelo.Usuario;

public class FormularioUsuarioMock implements  Formulario<Usuario> {

    @Override
    public Usuario cadastrar() {
        String dados = "João da Silva\njoao.silva@gmail.com\n1234578";
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
    
}
