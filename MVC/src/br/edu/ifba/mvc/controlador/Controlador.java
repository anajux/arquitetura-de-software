package br.edu.ifba.mvc.controlador;

import br.edu.ifba.mvc.modelo.Modelo;

public interface Controlador<Entidade> {
    public void iniciar(Modelo<Entidade> modelo); 

    public void cadastrar(Entidade entidade);

    public void listar();

    
}
