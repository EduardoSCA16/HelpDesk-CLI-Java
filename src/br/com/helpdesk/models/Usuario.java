package br.com.helpdesk.models;

public class Usuario extends Pessoa {
    private String email;
    private String password;
    private String setor;
    private boolean ativo;

    // Constructor
    public Usuario(String nome, int cpf, String email, String password, String setor, boolean ativo) {
        super(nome, cpf);
        this.email = email;
        this.password = password;
        this.setor = setor;
        this.ativo = ativo;
    }

    // Getters e Setters
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
