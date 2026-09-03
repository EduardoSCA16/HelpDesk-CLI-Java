package br.com.helpdesk.models;

public class Tecnico extends Usuario {
    private String especialidade;

    // Constructor
    public Tecnico(String nome, int cpf, String email, String password, String setor, String especialidade) {
        super(nome, cpf, email, password, setor);
        this.setAtivo(true);
        this.especialidade = especialidade;
    }

    // Get e Set
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
