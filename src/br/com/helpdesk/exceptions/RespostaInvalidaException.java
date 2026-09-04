package br.com.helpdesk.exceptions;

public class RespostaInvalidaException extends RuntimeException {
    public RespostaInvalidaException() {
        super("Resposta inválida!");
    }
}
