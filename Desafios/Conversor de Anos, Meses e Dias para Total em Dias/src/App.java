import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.print("-----------------");
        System.out.print("Conversor de Anos, Meses e Dias em Total de Dias");
        System.out.print("-----------------");
        
        Scanner scan = new Scanner(System.in);
        System.out.print("\nAnos: ");

        int anos = scan.nextInt();

        System.out.print("\nMeses: ");
        int meses = scan.nextInt();
        
        System.out.print("\nDias: ");
        int dias = scan.nextInt();

        int total = (anos * 365) + (meses * 30) + dias;

        System.out.printf("O total é %d dias.", total);


    }
}
