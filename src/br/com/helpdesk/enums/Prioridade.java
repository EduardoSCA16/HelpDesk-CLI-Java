package br.com.helpdesk.enums;

public enum Prioridade {
    BAIXA(1),
    MEDIA(2),
    ALTA(3),
    URGENTE(4);

    private final int nivel;

    Prioridade(int nivel) {
        this.nivel = nivel;
    }

    public int getNivel() {
        return nivel;
    }
}
