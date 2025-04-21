package br.edu.ifba.mvc.modelo;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifba.mvc.visao.Visao;

public abstract class Modelo <Entidade> {

    private final List <Visao<Entidade>> visoes = new ArrayList<>();

    public void adicionarVisao(Visao<Entidade> visao) {
        visoes.add(visao);
    }

    public void removerVisao(Visao<Entidade> visao) {
        visoes.remove(visao);
    }

    public void notificar (Resultado resultado, List<String> erros) {
        for (Visao<Entidade> visao: visoes) {
            visao.atualizar(resultado, erros);
        }
    }

    public void notificar(List<Entidade> entidades) {
        for (Visao<Entidade> visao : visoes) {
            visao.atualizar(entidades); 
        }
    }

    public abstract void gravar (Entidade entidade);

    public abstract void listar();
}

