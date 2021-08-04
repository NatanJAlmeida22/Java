package banco;
public class Banco {
    public static void main(String[] args) {
        ContaBanco c1 = new ContaBanco();
        c1.abrirConta("CC");
        c1.fecharConta();
        c1.estadoAtual();
    }
    
}
