package br.com.helpdesk.services;

import br.com.helpdesk.exceptions.RespostaInvalidaException;
import br.com.helpdesk.models.Usuario;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class UsuarioServices {
    Scanner sc = new Scanner(System.in);

    public Usuario criarUsuario() {
        while (true) {
            try {
                System.out.print("Digite Username: ");
                String user = sc.nextLine();

                System.out.println("CPF: ");
                String cpf = sc.nextLine();

                if (!cpfValido(cpf)) {
                    System.out.println("CPF inválido!");
                }

                System.out.print("Digite o email: ");
                String email = sc.nextLine();

                System.out.print("Digite a senha: ");
                String senha = sc.nextLine();

                System.out.print("Digite o setor: ");
                String setor = sc.nextLine();

                Usuario usuario = new Usuario(user, cpf, email, senha, setor);
                System.out.println("\nUsuário criado com sucesso!\n");
                return usuario;

            } catch (RespostaInvalidaException e) {
                System.out.println(e.getMessage());
                System.out.println("Pressione ENTER para continuar...");
                sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Resposta inválida! Somente números.");
                System.out.println("Pressione ENTER para continuar...");
                sc.nextLine();
            }
        }
    }

    public boolean cpfValido(String cpf) {
        cpf = cpf.replaceAll("\\D", "");

        return cpf.length() == 11;
    }

    // Criar um metodo de login
    public Usuario login(List<Usuario> usuarios) {
        return null;
    }
}
