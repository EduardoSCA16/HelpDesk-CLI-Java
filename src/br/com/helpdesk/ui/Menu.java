package br.com.helpdesk.ui;

public class Menu {

    public void telaLogin() {
        String mensagem = """
                \n================================
                           BEM VINDO!
                ================================
                
                1. Login
                2. Cadastrar usuário
                3. Sair
                
                Entrar como:\s""";
        System.out.print(mensagem);
    }

    public void exibirMenuUsuario() {
        String mensagem = """
                \n================================
                       HELP DESK - USUÁRIO
                ================================
                
                1. Criar Chamado
                2. Meus Chamados
                3. Logout
                
                Escolha uma opção:\s""";
        System.out.print(mensagem);
    }

    public void exibirMenuTecnico() {
        String mensagem = """
                \n================================
                       HELP DESK - TECNICO
                ================================
                
                1. Chamados
                2. Relatórios
                3. Usuários
                4. Técnicos
                5. Logout
                
                Escolha uma opção:\s""";
        System.out.print(mensagem);
    }

    public void exibirCriarChamado() {
        String mensagem = """
                \n================================
                         CRIAR CHAMADO
                ================================
                """;
        System.out.println(mensagem);
    }

    public void exibirMeusChamados() {
        String mensagem = """
                \n================================
                          MEUS CHAMADOS
                ================================
                """;
        System.out.println(mensagem);
    }

    public void exibirChamados() {
        String mensagem = """
                \n================================
                            CHAMADOS
                ================================
                """;
        System.out.println(mensagem);
    }

    public void exibirRelatorios() {
        String mensagem = """
                \n================================
                           RELATÓRIOS
                ================================
                """;
        System.out.println(mensagem);
    }

    public void exibirUsuarios() {
        String mensagem = """
                \n================================
                           USUÁRIOS
                ================================
                """;
        System.out.println(mensagem);
    }

    public void exibirTecnicos() {
        String mensagem = """
                \n================================
                           TÉCNICOS
                ================================
                """;
        System.out.println(mensagem);
    }
}
