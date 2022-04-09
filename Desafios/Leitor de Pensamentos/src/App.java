import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Random gerador = new Random();
        Scanner scan = new Scanner(System.in);

        int pesamento = gerador.nextInt(6);

        System.out.println("-=-=--=-=-Adivinhe o n° que estou pensando!-=-=--=-=-");
        
        int palpite = 0;

        while (palpite != pesamento) {
            System.out.print("Palpite: ");
            palpite = scan.nextInt();

            if (palpite != pesamento) {
                System.out.println("ERROU!!! Tente Novamente!");
            }

            else {
                System.out.println("Parabéns!! Você venceu, eu pensei no número: " + palpite);
            }

        }


    }
}
