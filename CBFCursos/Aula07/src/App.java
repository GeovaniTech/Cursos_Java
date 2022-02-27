import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        int[] num = {15,30,45,60,75, 9, 3, 1};
        int[] numeros = new int[8];

        // Ordenando os números - Crescente
        //Arrays.sort(num);

        // Preenche a Array de acordo com o valor informado
        //Arrays.fill(numeros, 15);

        // Copiando uma Array para outra
        //System.arraycopy(num, 0, numeros, 0, 8);

        // Se ambos forem iguais retorta True else False
        //System.out.print(Arrays.equals(num, numeros));

        // Usada para saber se o valor informado está na Array, sempre ordenar a Array

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o valor a ser verificado: ");
        int valor_user = scan.nextInt();

        Arrays.sort(num);

        int pos;

        pos = Arrays.binarySearch(num, valor_user);

        if (pos > 0) {
            System.out.printf("O valor já está cadastrado! E está na posição %d", pos);
        }
        
        else {
            System.out.print("O valor não está cadastrado!");
        }

        // Usar somente para ler e comparar os elementos da Array
        /*for (int n:numeros) {
            System.out.printf("Valor: %d\n", n);
        }*/

    }
}
