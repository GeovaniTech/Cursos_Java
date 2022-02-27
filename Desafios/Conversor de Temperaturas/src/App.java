import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe a temperatura em °C: ");
        float temperatura = scan.nextFloat();


        float Kelvin = temperatura + 273.15f;
        float Réaumur = temperatura * 0.8f;
        float Rankine=  (temperatura * 1.8f) + 32 + 459.67f;
        float Fahrenheit = (temperatura * 1.8f) + 32;
        
        System.out.printf("%.2f °C é igual a:\n", temperatura);

        System.out.printf("Temperatura em Fahrenheit: %.2f \n", Fahrenheit);
        System.out.printf("Temperatura em Réaumur: %.2f \n", Réaumur);
        System.out.printf("Temperatura em Rankine: %.2f \n", Rankine);
        System.out.printf("Temperatura em Kelvin: %.2f \n", Kelvin);
    }
}
