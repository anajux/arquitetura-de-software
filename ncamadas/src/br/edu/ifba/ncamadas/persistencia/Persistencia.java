package br.edu.ifba.ncamadas.persistencia;

import java.util.List;

public interface Persistencia<Entidade> {

    public Resultado gravar(Entidade entidade);

    public List<Entidade> listar();
}
