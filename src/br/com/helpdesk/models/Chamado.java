package br.com.helpdesk.models;

import br.com.helpdesk.enums.Prioridade;
import br.com.helpdesk.enums.StatusChamado;

public class Chamado {
    private static int idChamado = 0;
    private String titulo;
    private String descricao;
    private Usuario usuario;
    private StatusChamado statusChamado;
    private Prioridade prioridade;

    // Getters e Setters
    public static int getIdChamado() {
        return idChamado;
    }

    public static void setIdChamado(int idChamado) {
        Chamado.idChamado = idChamado;
    }

    public StatusChamado getStatusChamado() {
        return statusChamado;
    }

    public void setStatusChamado(StatusChamado statusChamado) {
        this.statusChamado = statusChamado;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Prioridade prioridade) {
        this.prioridade = prioridade;
    }

    public Chamado(String titulo, String descricao, Usuario usuario, Prioridade prioridade) {
        this.idChamado = idChamado++;
        this.titulo = titulo;
        this.descricao = descricao;
        this.usuario = usuario;
        this.statusChamado = StatusChamado.ABERTO;
        this.prioridade = prioridade;
    }
}
