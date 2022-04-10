import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        
        int tot_valores = 0;
        int tot_pares = 0;
        int tot_impares = 0;
        int tot_100 = 0;
        int media = 0;
        int valor = 1;


        while (valor != 0) {
            valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor: "));

            media += valor;
            tot_valores += 1;

            if (valor % 2 == 0) {
                tot_pares += 1;
            }

            else {
                tot_impares += 1;
            }

            if (valor > 100) {
                tot_100 += 1;
            }
        }

        JOptionPane.showMessageDialog(null, "Total de valores: " + tot_valores + "\nTotal de Pares" + tot_pares
        + "\nTotal de Ímpares: " + tot_impares + "\nAcima de 100: " + tot_100 + "\nMédia: " + media / tot_valores, "Resultados", JOptionPane.INFORMATION_MESSAGE);

    }
}
