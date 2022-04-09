import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int ano_atual = 2022;

        Scanner scan = new Scanner(System.in);

        System.out.print("Ano de Nascimento: ");
        int nascimento = scan.nextInt();

        int idade = ano_atual - nascimento;

        if(idade >= 16 && idade < 18 || idade >= 70) {
            System.out.println("Seu voto é opcional!");
        }

        else if (idade < 16){
            System.out.println("Você não pode votar!");
        }

        else {
            System.out.println("Voto obrigatório!");
        }



    }
}
