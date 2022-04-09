import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Digite um número: ");
        Scanner scan = new Scanner(System.in);
        int valor = scan.nextInt();

        if (valor % 2 == 0) {
            System.out.println("O número " + valor + " é par!");
        }

        else if (valor % 2 == 1) {
            System.out.println("O número " + valor + " é ímpar!");
        }





    }
}
