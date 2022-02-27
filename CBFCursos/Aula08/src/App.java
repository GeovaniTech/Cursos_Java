import java.security.SecureRandom;

public class App {
    public static void main(String[] args) throws Exception {
        final int linhas = 3;
        final int colunas = 5;

        int[][] numeros = new int[linhas][colunas];

        for (int l = 0; l < linhas; l++) {
            for (int c = 0; c < colunas; c++) {
                numeros[l][c] = new SecureRandom().nextInt(10);
            }
        }

        for (int l = 0; l < linhas; l++) {
            for (int c = 0; c < colunas; c++) {
                
                System.out.printf("| %d |", numeros[l][c]);
                numeros[l][c] = new SecureRandom().nextInt(9);
            }
            System.out.print("\n");
        }
        
        for (int[] n:numeros) {
            for (int v:n) {
                System.out.printf("| %d |", v);
            }
            System.out.print("\n");
        }

    }
}
