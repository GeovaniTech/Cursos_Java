import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("A: ");
        int a = scan.nextInt();
        System.out.print("B: ");
        int b = scan.nextInt();
        System.out.print("C: ");
        int c = scan.nextInt();

        int delta = (b * b) - 4 * a * c;

        if (delta > 0) {
            System.out.println("Existem raízes reais para este delta: " + delta);
        }

        else {
            System.out.println("Não existem raízes reias para este delta: " + delta);
        }

    }
}
