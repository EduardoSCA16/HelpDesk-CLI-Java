package br.com.helpdesk;

import br.com.helpdesk.exceptions.RespostaInvalidaException;
import br.com.helpdesk.models.Chamado;
import br.com.helpdesk.models.Tecnico;
import br.com.helpdesk.models.Usuario;
import br.com.helpdesk.services.ChamadoServices;
import br.com.helpdesk.services.UsuarioServices;
import br.com.helpdesk.ui.Menu;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        ChamadoServices chamadoServices = new ChamadoServices();
        UsuarioServices usuarioServices = new UsuarioServices();
        List<Usuario> usuarios = new ArrayList<>();
        List<Chamado> chamados = new ArrayList<>();
        Tecnico tecnico = new Tecnico(
                "Eduardo SCA",
                "12345678909",
                "tecnico@helpdesk.com",
                "admin123",
                "TI",
                "Suporte"
        );
        usuarios.add(tecnico);
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        while (true) {
            try {
                menu.telaLogin();
                int login = sc.nextInt();
                sc.nextLine();

                int opcao;
                if (login == 1) {
                    Usuario usuarioLogado = usuarioServices.login(usuarios);

                    if (usuarioLogado != null) {
                        if (usuarioLogado instanceof Tecnico) {
                            // Login como Técnico
                            menu.exibirMenuTecnico();
                            opcao = sc.nextInt();
                            sc.nextLine();

                            if (opcao < 1 || opcao > 5) {
                                throw new RespostaInvalidaException();
                            }


                        } else {
                            // Login como Usuário
                            menu.exibirMenuUsuario();
                            opcao = sc.nextInt();
                            sc.nextLine();

                            if (opcao < 1 || opcao > 4) {
                                throw new RespostaInvalidaException();
                            }

                            if (opcao == 1) {
                                menu.exibirCriarChamado();
                                chamadoServices.criarChamado(usuarioLogado);
                            }
                        }
                    }

                } else if (login == 2) {
                    Usuario usuarioCadastrado = usuarioServices.criarUsuario();
                    usuarios.add(usuarioCadastrado);

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
