// Aula sobre Métodos/Funções
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        aprendendo("N1: ");
        int n1 = scan.nextInt(); 

        aprendendo("N2: ");
        int n2 = scan.nextInt(); 

        aprendendo("O resultado da soma é " + soma(n1, n2));

        // Some numbers
        aprendendo("\nO resultado da soma de vários números é " + soma_varios(2.5));
    }  

    public static int soma(int n1, int n2) {
        int soma = n1 + n2;      
        return soma;
    }

    public static int soma_varios(int... nums) {
        int resultado = 0;

        for (int n:nums) {
            resultado += n;
        }
        return resultado;
    }

    // Sobrecarga de métodos, duas funções com o mesmo obejetivo recebendo diferentes args
    public static Double soma_varios(Double... nums) {
        Double resultado = 0.0;

        for (Double n:nums) {
            resultado += n;
        }
        return resultado;
    }

    public static void aprendendo(String msg) {
        System.out.printf(msg);       
    }
}