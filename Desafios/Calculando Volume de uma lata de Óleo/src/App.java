import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("Fornece as informações da lata: ");
        
        System.out.print("Raio: ");
        float raio = scan.nextFloat();

        System.out.print("Altura: ");
        float altura = scan.nextFloat();

        System.out.printf("O volume desta lata é igual a: %.2f m3", 3.14159f * raio * raio * altura);
        

    }
}
