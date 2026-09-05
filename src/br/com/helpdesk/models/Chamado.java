package br.com.helpdesk.models;

import br.com.helpdesk.enums.Prioridade;
import br.com.helpdesk.enums.StatusChamado;

public class Chamado {
    private static int proximoIdChamado = 1;
    private int idChamado;
    private String titulo;
    private String descricao;
    private Usuario usuario;
    private StatusChamado statusChamado;
    private Prioridade prioridade;

    // Getters e Setters
    public int getIdChamado() {
        return idChamado;
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    // Constructor
    public Chamado(String titulo, String descricao, Usuario usuario, Prioridade prioridade) {
        this.idChamado = proximoIdChamado++;
        this.titulo = titulo;
        this.descricao = descricao;
        this.usuario = usuario;
        this.statusChamado = StatusChamado.ABERTO;
        this.prioridade = prioridade;
    }

    // toString
    @Override
    public String toString() {;
        return  "ID: " + idChamado + "\n" +
                "Usuário: " + usuario.getNome() + "\n" +
                "Título: " + titulo + "\n" +
                "Descrição: " + descricao + "\n" +
                "Status Chamado: " + statusChamado + "\n" +
                "Prioridade: " + prioridade;
    }
}
