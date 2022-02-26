// Switch e Cases
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        try (Scanner myObj = new Scanner(System.in)) {
            System.out.print("Digite a posição: ");
            int num = myObj.nextInt();
            
            switch (num){
                case 1:
                    System.out.print("Primeiro Lugar");
                    break;
                case 2:
                    System.out.print("Segundo Lugar");
                    break;
                case 3:
                    System.out.print("Terceiro Lugar");
                    break;
                default:
                    System.out.print("Não entrou no pódio :(");
            }
        }
    }
}
