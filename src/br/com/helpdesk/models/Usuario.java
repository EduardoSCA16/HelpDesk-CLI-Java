package br.com.helpdesk.models;

public class Usuario extends Pessoa {
    private String email;
    private String password;
    private String setor;
    private boolean admin;

    // Constructor
    public Usuario(String nome, String cpf, String email, String password, String setor) {
        super(nome, cpf);
        this.email = email;
        this.password = password;
        this.setor = setor;
        this.admin = false;
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

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    @Override
    public String toString() {
        return  "Nome: " + getNome() + "\n" +
                "Email: " + email + "\n" +
                "Setor: " + setor + "\n" +
                "Admin: " + admin;
    }
}
