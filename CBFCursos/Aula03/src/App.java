import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner myObj = new Scanner(System.in);
        
        // Primeira Nota
        System.out.print("Nota 1: ");
        Float n1 = myObj.nextFloat();
        
        System.out.print("Nota 2: ");
        Float n2 = myObj.nextFloat();

        Float media = (n1 + n2) / 2;

        if (media < 7) {
            System.out.printf("Aluno Reprovado! Média: %f", media);
        }

        else {
            System.out.printf("Aluno Aprovado! Média: %.2f", media);
        }

    }
}
