package projetoyoutube;

public class ProjetoYoutube {

    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML5");
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubileu", 22, "M", "Juba");
        g[1] = new Gafanhoto("Creuza", 12, "F", "Creuzita");
        
        Visualizacao v1[] = new Visualizacao[5];
        v1[0] = new Visualizacao(g[0], v[2]);
        v1[0].avaliar(); 
        System.out.println(v1[0].toString());
        v1[0] = new Visualizacao(g[0], v[1]);
        v1[0].avaliar(87.0f );
        System.out.println(v1[0].toString());
    }
    
}
