package br.com.helpdesk.services;

import br.com.helpdesk.enums.Prioridade;
import br.com.helpdesk.enums.StatusChamado;
import br.com.helpdesk.models.Chamado;
import br.com.helpdesk.models.Usuario;

import java.util.List;
import java.util.Scanner;

public class ChamadoServices {
    Scanner sc = new Scanner(System.in);

    public void alterarStatus(List<Chamado> chamados) {
        System.out.print("Digite o ID do chamado que deseja alterar: ");
        int id = sc.nextInt();
        System.out.println("""
                Defina o novo Status:
                1. Aberto
                2. Em Andamento
                3. Resolvido
                4. Fechado""");
        int opcao = sc.nextInt();
        StatusChamado novoStatus = switch (opcao) {
            case 1 -> StatusChamado.ABERTO;
            case 2 -> StatusChamado.EM_ANDAMENTO;
            case 3 -> StatusChamado.RESOLVIDO;
            case 4 -> StatusChamado.FECHADO;
            default -> {
                System.out.println("Opção inválida. Definida como Status Aberto.");
                yield StatusChamado.ABERTO;
            }
        };

        for (Chamado chamado : chamados) {
            if (chamado.getIdChamado() == id) {
                chamado.setStatusChamado(novoStatus);
            }
        }
        System.out.println("\nStatus alterado!");
        System.out.print("Pressione ENTER para continuar...");
        sc.nextLine();
    }

    public Chamado criarChamado(Usuario usuario) {
        System.out.print("Título: ");
        String titulo = sc.nextLine();

        System.out.print("Descrição: ");
        String descricao = sc.nextLine();

        String prioridades = """
                Prioridade
                1. Baixa
                2. Média
                3. Alta
                4. Urgente
                Escolha:\s""";
        System.out.print(prioridades);
        int opcao = sc.nextInt();
        sc.nextLine();

        Prioridade prioridade = switch (opcao) {
            case 1 -> Prioridade.BAIXA;
            case 2 -> Prioridade.MEDIA;
            case 3 -> Prioridade.ALTA;
            case 4 -> Prioridade.URGENTE;
            default -> {
                System.out.println("Opção inválida. Definida como Prioridade Baixa.");
                yield Prioridade.BAIXA;
            }
        };

        System.out.println("\nChamado criado com sucesso!");
        System.out.print("Pressione ENTER para continuar...");
        sc.nextLine();
        return new Chamado(titulo, descricao, usuario, prioridade);
    }

    public void listarTodosOsChamados(List<Chamado> chamados) {
        for (Chamado chamado : chamados) {
            System.out.println(chamado.toString() + "\n");
        }
        System.out.print("Pressione ENTER para continuar...");
        sc.nextLine();
    }

    public void listarChamadosDoUsuario(List<Chamado> chamados, Usuario usuario) {
        for (Chamado chamado : chamados) {
            if (chamado.getUsuario().equals(usuario)) {
                System.out.println(chamado + "\n");
            }
        }
        System.out.print("Pressione ENTER para continuar...");
        sc.nextLine();
    }

    public void gerarRelatorio(List<Chamado> chamados) {
        int qtdChamados = 0;
        int qtdChamadosAbertos = 0;
        int qtdChamadosEmAndamento = 0;
        int qtdChamadosResolvidos = 0;
        int qtdChamadosFechados = 0;

        for (Chamado chamado : chamados) {
            qtdChamados++;
            switch (chamado.getStatusChamado()) {
                case ABERTO -> qtdChamadosAbertos++;
                case EM_ANDAMENTO -> qtdChamadosEmAndamento++;
                case RESOLVIDO -> qtdChamadosResolvidos++;
                case FECHADO -> qtdChamadosFechados++;
            }
        }
        String relatorio =  "Quantidade de Chamados: " + qtdChamados + "\n" +
                            "Chamados em Aberto: " + qtdChamadosAbertos + "\n" +
                            "Chamados em Andamento: " + qtdChamadosEmAndamento + "\n" +
                            "Chamados Resolvidos: " + qtdChamadosResolvidos + "\n" +
                            "Chamados Fechados: " + qtdChamadosFechados + "\n";
        System.out.println(relatorio);
        System.out.print("Pressione ENTER para continuar...");
        sc.nextLine();
    }

}
