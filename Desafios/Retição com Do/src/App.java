import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        int cc = 1;
        String resp;

        Scanner scan = new Scanner(System.in);
        
        do {
            System.out.println("Hello, World!");
            
            System.out.print("Deseja ver mais um Hello? R(S/N): ");
            resp = scan.nextLine().toUpperCase();


        } while (resp.equals("S"));
    }
}
