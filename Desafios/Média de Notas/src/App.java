import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("Nota 1: ");
        float n1 = scan.nextFloat();


        System.out.print("Nota 2: ");
        float n2 = scan.nextFloat();
        
        double m = (n1 + n2) / 2;

        if (m > 8.5) {
            System.out.println("Parabéns!!! Sua média foi " + m);
        }
        
        else {
            System.out.print("Sua média foi " + m);
        }

    }
}
