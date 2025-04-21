package br.edu.ifba.mvc.visao;

import java.util.List;
import br.edu.ifba.mvc.modelo.Resultado;

public interface Visao <Entidade> {
    Entidade getEntidade();

    void atualizar(Resultado resultado, List <String> erros);

    void atualizar(List<Entidade> entidades);

    

}
