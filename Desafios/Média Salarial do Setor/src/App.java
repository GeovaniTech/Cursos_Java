import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        float salario = 0;

        System.out.print("Setor: ");
        String setor = scan.nextLine();
        
        System.out.print("Quantidade Funcionários: ");
        int funcionários = scan.nextInt();

        for (int i = 0; i < funcionários; i++) {
            System.out.printf("%d° Salário: R$ ", i + 1);
            salario += scan.nextFloat();
        }
        
        System.out.print("\n");
        System.out.printf("A média Salárial dos %d funcionários da %s é de R$ %.2f", funcionários, setor, salario / funcionários);


    }
}
