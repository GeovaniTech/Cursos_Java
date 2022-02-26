import javax.sound.sampled.SourceDataLine;

public class App {
    public static void main(String[] args) throws Exception {
        // Iphone 12, tela 6.1', 256gb
        // Xiaomi Note 10, tela 6.4', 64gb
        
        Celular celularA = new Celular();
        celularA.nome = "Iphone 12";
        celularA.tela = 6.1f;
        celularA.armazenamento = 256;
        celularA.so = "IOS";

        Celular celularB = new Celular();
        celularB.nome = "Xiaomi Note 10";
        celularB.tela = 6.4f;
        celularB.armazenamento = 64;
        celularB.so = "Android";

        System.out.format("Celular %s com tela de %.1f, com %dgb e SO %s\n", celularA.nome, celularA.tela, celularA.armazenamento, celularA.so);
        System.out.format("Celular %s com tela de %.1f, com %dgb e SO %s", celularB.nome, celularB.tela, celularB.armazenamento, celularB.so);    
    }
}


