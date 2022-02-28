import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("Bem-vindo(a) ao Sistema!\n");

        System.out.print("Cod de Acesso: ");
        int cod_user = scan.nextInt();

        System.out.print("Senha: ");
        int senha_user = scan.nextInt();

        while (cod_user != 1234 && senha_user != 9999) {
            System.out.print("Cod de Acesso ou Senha inválidos!\n");
            
            System.out.print("Cod de Acesso: ");
            cod_user = scan.nextInt();
    
            System.out.print("Senha: ");
            senha_user = scan.nextInt();
        }

        System.out.print("Acesso Permitido!");

    }
}
