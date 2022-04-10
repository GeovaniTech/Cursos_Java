import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("Valor incial: ");
        int valor_inicial = scan.nextInt();

        System.out.print("Valor final: ");
        int valor_final = scan.nextInt();

        System.out.print("Valor do passo: ");
        int passo = scan.nextInt();

        for (int i = valor_inicial; i <= valor_final; i += passo) {
            System.out.println(i);
        }


    }
}
