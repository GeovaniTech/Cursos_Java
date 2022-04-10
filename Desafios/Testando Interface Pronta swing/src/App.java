import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        
        for (int i = 0; i < 10; i++) {
            int valor = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Digite um valor: <br><em>(Use 0 para interromper)</em></br></html>", "Janela", JOptionPane.INFORMATION_MESSAGE));
            JOptionPane.showMessageDialog(null, "Você digitou o número: " + valor, "Valor Digitado", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
