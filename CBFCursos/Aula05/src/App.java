// Estrutura de Repetições
public class App {
    public static void main(String[] args) throws Exception {
        
        /*for (int count = 10; count > 0; count--){
            
            System.out.printf("Em %d.\n", count);

            if (count == 1) {
                System.out.print("Pare tudo! Acabou o tempo.");
            }
        }*/

        /*
        while (count > 0) {
        
        System.out.printf("Em %d\n", count);
        count -= 1;

        if (count == 0) {
            System.out.print("Pare tudo! Acabou o tempo.");
        }
    }
        */

        int count = 10;

        // Do - Excuta pelo menos uma vez o comando interno

        do {
            System.out.printf("Em %d\n", count);
            count--;

            if (count == 0) {
                System.out.print("Pare tudo! Acabou o tempo.");
            }
            
        } while (count > 0);

    }
}
