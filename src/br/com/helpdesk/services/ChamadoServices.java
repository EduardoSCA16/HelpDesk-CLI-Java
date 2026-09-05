package br.com.helpdesk.services;

import br.com.helpdesk.enums.Prioridade;
import br.com.helpdesk.enums.StatusChamado;
import br.com.helpdesk.models.Chamado;
import br.com.helpdesk.models.Usuario;

import java.util.List;
import java.util.Scanner;

public class ChamadoServices {
    Scanner sc = new Scanner(System.in);

    public void alterarStatus(Chamado chamado, StatusChamado novoStatus){
        chamado.setStatusChamado(novoStatus);
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

}
