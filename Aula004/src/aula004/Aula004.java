package aula004;

public class Aula004 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta("NICK", "AMARELA", 0.4f);
        //c1.setModelo("BIC");
        //c1.modelo = "BIC";
        //c1.setPonta(0.5f);
        c1.status();
        
        Caneta c2 = new Caneta("KKK", "LARANJA", 1.5f);
        c2.status();
    }
    
}
