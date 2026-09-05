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
                System.out.print("Nome completo: ");
                String user = sc.nextLine();

                System.out.print("CPF: ");
                String cpf = sc.nextLine();

                cpf = padronizarCPF(cpf);
                if (!validarTamanhoCPF(cpf)) {
                    System.out.println("CPF inválido!");
                    continue;
                }

                System.out.print("Digite o email: ");
                String email = sc.nextLine();

                System.out.print("Digite a senha: ");
                String senha = sc.nextLine();

                System.out.print("Digite o setor: ");
                String setor = sc.nextLine();

                Usuario usuario = new Usuario(user, cpf, email, senha, setor);
                System.out.print("\nUsuário cadastrado com sucesso!\n");
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

    public String padronizarCPF(String cpf) {
        cpf = cpf.replaceAll("\\D", "");
        return cpf;
    }

    public boolean validarTamanhoCPF(String cpf) {
        if (cpf.length() == 11) {
            return true;
        } else {
            return false;
        }
    }

    public Usuario login(List<Usuario> usuarios) {
        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Senha: ");
        String senha = sc.nextLine();

        for (Usuario usuario : usuarios) {
            if (email.equalsIgnoreCase(usuario.getEmail()) && senha.equals(usuario.getPassword())) {
                return usuario;
            }
        }

        System.out.println("\nUsuário não cadastrado ou email e senha estão incorretos.");
        return null;
    }
}
