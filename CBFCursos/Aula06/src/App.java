public class App {
    public static void main(String[] args) throws Exception {
        
    /* 
        int[] nums = new int[5];
        int[] numeros = {10, 20, 30, 40, 50};

        nums[0] = 1;
        nums[1] = 3;
        nums[2] = 5;
        nums[3] = 4;
        nums[4] = 2;

        for (int p = 0; p < nums.length; p++) {
            System.out.printf("Posição %d = %d\n", p + 1, nums[p]);
        }
        
        System.out.println(" ");

        for (int p = 0; p < numeros.length; p++) {
            System.out.printf("Posição %d = %d\n", p + 1, numeros[p]);
        }
    */

        char[] gabarito = {'a', 'b', 'c', 'd', 'e'};
    
        char[] respostas = new char[5];

        int nota = 0;

        respostas[0] = 'a';
        respostas[1] = 'a';
        respostas[2] = 'a';
        respostas[3] = 'a';
        respostas[4] = 'a';

        for (int r = 0; r < gabarito.length; r++) {
            if (respostas[r] == gabarito[r]) {
                nota += 2;
            }
        }

        System.out.printf("A nota do Aluno foi %d", nota);
    
    }   



}
