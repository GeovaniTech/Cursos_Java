import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Ano de Nascimento: ");
        Scanner scan = new Scanner(System.in);
        int nascimento = scan.nextInt();
        int ano_atual = 2022;

        int idade = ano_atual - nascimento;
        
        if (idade >= 18) {
            System.out.println("Você é maior de idade!");
        }

        else {
            System.out.println("Você é menor de idade!");
        }
        




    }
}
