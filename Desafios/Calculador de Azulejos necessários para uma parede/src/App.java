import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("------------");
        System.out.print("Calculador de Azulejos");
        System.out.print("------------\n");

        System.out.print("Altura da Parede: ");
        float alt_parede = scan.nextFloat();

        System.out.print("Largura da Parede: ");
        float lar_parede = scan.nextFloat();

        System.out.print("Altura da Azulejo: ");
        float alt_azulejo = scan.nextFloat();

        System.out.print("Largura da Azulejo: ");
        float lar_azulejo = scan.nextFloat();

        float qtde = (lar_parede * alt_parede) / (alt_azulejo * lar_azulejo);

        System.out.printf("A quantidade nescessária de Azulejos é: %.2f", qtde);
    }
}
