import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe um valor inteitero: ");
        int valor_user = scan.nextInt();

        System.out.printf("O antecessor de %d é %d e seu sucessor é %d.", valor_user, valor_user - 1, valor_user + 1);
    }
}
