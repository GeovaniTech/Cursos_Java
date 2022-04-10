import java.util.GregorianCalendar;

public class App {
    public static void main(String[] args) throws Exception {
        String mes[] = {"jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez"};
        int dias[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        GregorianCalendar cal = new GregorianCalendar();

        int ano = cal.YEAR;

        if (ano % 4 == 0) {
            dias[1] = 29;
        }

        for (int i = 0; i < mes.length; i++) {
            System.out.println("O mês de " + mes[i] + " tem " + dias[i] + " dias");
        }

    }
}
