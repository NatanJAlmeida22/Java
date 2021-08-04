package banco;
public class Banco {
    public static void main(String[] args) {
        ContaBanco c1 = new ContaBanco();
        c1.setNumConta(1111);
        c1.setDono("Jubileu");
        c1.abrirConta("CC");
        
        
        c1.estadoAtual();
    }
    
}
