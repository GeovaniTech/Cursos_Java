import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        try (Scanner scan = new Scanner(System.in)) {
            char sexo;
            int qtd_mulheres = 0;

            float altura = 0;
            float maior_altura = 0;
            float menor_altura = 0;
            float alturas_homens = 0;


            for (int i = 0; i < 10; i++) {
                System.out.print("Informe a altura: ");
                altura = scan.nextFloat();

                System.out.print("Informe o Sexo [M/F]: ");

                sexo = scan.next().charAt(0);

                if (altura > maior_altura) {
                    maior_altura = altura;
                }

                if (menor_altura == 0 || altura < menor_altura) {
                    menor_altura = altura;
                }

                if (sexo == 'M') {
                    alturas_homens += altura;
                }
                
                else {
                    qtd_mulheres++;
                }
            }
            System.out.print("\n");
            System.out.printf("A maior Altura cadastrada foi %.2f \n", maior_altura);
            System.out.printf("A menor Altura cadastrada foi %.2f \n", menor_altura);
            System.out.printf("A média de Altura dos homens é %.2f \n", alturas_homens / (10 - qtd_mulheres));
            System.out.printf("A quantidade de mulheres cadastradas foram %d \n", qtd_mulheres);
        }


    }
}
