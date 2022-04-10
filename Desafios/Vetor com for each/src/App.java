import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {

        int valores[] = {5, 6, 7, 4, 1 ,2 ,8};

        Arrays.sort(valores);

        for (int valor:valores) {
            System.out.println("Valor: " + valor);
        }

        int p = Arrays.binarySearch(valores, 4);

        System.out.println("O valor 4 está na posição: " + p);

    }  
}
