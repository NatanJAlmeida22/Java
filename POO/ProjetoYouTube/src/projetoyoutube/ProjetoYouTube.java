package projetoyoutube;
public class ProjetoYouTube {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de Java");
        v[2] = new Video("Aula 10 de HTML");
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubileu", "M", 22, "juba");
        g[1] = new Gafanhoto("Creuza", "F", 12, "creuzita");
        
        System.out.println(v[0].toString());
        System.out.println(g[0].toString());
    }
    
}
