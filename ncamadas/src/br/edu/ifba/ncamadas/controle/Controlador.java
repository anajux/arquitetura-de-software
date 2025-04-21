package br.edu.ifba.ncamadas.controle;

import java.util.List;

import br.edu.ifba.ncamadas.persistencia.Persistencia;
import br.edu.ifba.ncamadas.persistencia.Resultado;

public abstract class Controlador<Entidade> {
    
    private Persistencia<Entidade> persistencia;
    private Notificador<Entidade> notificador;

    public void iniciar(Persistencia<Entidade> persistencia, Notificador<Entidade> notificador) {
        this.persistencia = persistencia;
        this.notificador = notificador;
    }

    public void gravar(Entidade entidade) {
        Resultado resultado = Resultado.ERRO;

        List<String> erros = listarErros(entidade);
        if (erros.isEmpty()) {
            resultado = persistencia.gravar(entidade);
        }

        notificador.aoGravarEntidade(resultado, erros, entidade);
    }

    public void listar() {
        notificador.aoBuscarEntidades(persistencia.listar());
    }

    public abstract List<String> listarErros(Entidade entidade);

}
