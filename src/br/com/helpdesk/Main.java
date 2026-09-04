package br.com.helpdesk;

import br.com.helpdesk.exceptions.RespostaInvalidaException;
import br.com.helpdesk.models.Chamado;
import br.com.helpdesk.services.ChamadoServices;
import br.com.helpdesk.ui.Menu;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        ChamadoServices chamadoServices = new ChamadoServices();
        List<Chamado> chamados = new ArrayList<>();

        while (true) {
            try {
                menu.telaLogin();
                int login = sc.nextInt();
                sc.nextLine();

                int opcao;
                if (login == 1) {
                    menu.exibirMenuUsuario();
                    opcao = sc.nextInt();
                    sc.nextLine();

                    if (opcao < 1 || opcao > 4) {
                        throw new RespostaInvalidaException();
                    }

                    if (opcao == 1) {
                        menu.exibirCriarChamado();
                        // Configurar um usuário
                        chamadoServices.criarChamado(usuario);
                    }
                } else if (login == 2) {
                    menu.exibirMenuTecnico();
                    opcao = sc.nextInt();
                    sc.nextLine();

                    if (opcao < 1 || opcao > 5) {
                        throw new RespostaInvalidaException();
                    }
                } else if (login == 3) {
                    break;
                } else {
                    throw new RespostaInvalidaException();
                }

            } catch (RespostaInvalidaException e) {
                System.out.println(e.getMessage());
                System.out.println("Pressione ENTER para continuar...");
                sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Resposta inválida! Somente números.");                System.out.println("Pressione ENTER para continuar...");
                System.out.println("Pressione ENTER para continuar...");
                sc.nextLine();
            }
        }

        System.out.println("\nPrograma encerrado corretamente!");

    }
}
