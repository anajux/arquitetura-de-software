package br.edu.ifba.ncamadas.controle;

import java.util.List;

import br.edu.ifba.ncamadas.persistencia.Resultado;

public interface Notificador<Entidade> {
    
    public void aoGravarEntidade(Resultado resultado, List<String> erros, Entidade entidade);

    public void aoBuscarEntidades(List<Entidade> entidades);

}
