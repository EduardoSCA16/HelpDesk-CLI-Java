package br.com.helpdesk.ui;

public class Menu {

    public String telaLogin() {
        return """
                ================================
                           BEM VINDO!
                ================================
                
                Entrar como:
                1. Usuário
                2. Técnico
                """;
    }

    public String exibirMenuUsuario() {
        return """
                ================================
                       HELP DESK - USUÁRIO
                ================================
                
                1. Criar Chamado
                2. Meus Chamados
                5. Logout
                """;
    }

    public String exibirMenuTecnico() {
        return """
                ================================
                       HELP DESK - TECNICO
                ================================
                
                1. Chamados
                2. Relatórios
                3. Usuários
                4. Técnicos
                5. Logout
                """;
    }

    public String exibirCriarChamado() {
        return """
                ================================
                         CRIAR CHAMADO
                ================================
                """;
    }

    public String exibirMeusChamados() {
        return """
                ================================
                          MEUS CHAMADOS
                ================================
                """;
    }

    public String exibirChamados() {
        return """
                ================================
                            CHAMADOS
                ================================
                """;
    }

    public String exibirRelatorios() {
        return """
                ================================
                           RELATÓRIOS
                ================================
                """;
    }

    public String exibirUsuarios() {
        return """
                ================================
                           USUÁRIOS
                ================================
                """;
    }

    public String exibirTecnicos() {
        return """
                ================================
                           TÉCNICOS
                ================================
                """;
    }
}
