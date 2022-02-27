import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o Salário: R$ ");
        
        float salario = scan.nextFloat();

        System.out.printf("O Salário de R$ %.2f com ajuste de 1%s vai para R$ %.2f", salario, "%", salario + (salario * 0.01));

    }
}
