import java.util.Scanner;

public class LoginScreen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = "admin";
        String password = "password";
        String returnLogin = "S";

        while (returnLogin.equals("s") || returnLogin.equals("S")) {
            System.out.println("Qual o seu nome?");
            String inputName = sc.nextLine();

            System.out.println("Digite seu nome de usuário: ");
            String inputUsername = sc.nextLine();

            System.out.println("Digite a sua senha: ");
            String inputPassword = sc.nextLine();

            if (inputUsername.equals(username) && inputPassword.equals(password)) {
                System.out.println("Bem vindo! " + inputName);
            } else {
                System.out.println("Nome de usuário ou senha incorretos!");
            }
            System.out.println("Deseja fazer outro Login?");
            returnLogin = sc.nextLine();
        }

        sc.close();
    }
}