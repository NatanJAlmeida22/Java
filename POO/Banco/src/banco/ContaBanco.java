package banco;

import javax.swing.JOptionPane;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }
    
    public void estadoAtual() {
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.status);
    }
   
    public void abrirConta(String tipo) {
        this.setTipo(tipo);
        this.setStatus(true);
        
        if (tipo == "CC") {
            this.setSaldo(this.getSaldo() + 50);
        } else if (tipo == "CP") {
            this.setSaldo(this.getSaldo() + 150);
        }
    }
    
    public void fecharConta() {
        if (this.getSaldo() < 0) {
            System.out.println("Fechamento não realizado. Conta negativada!!!");
        } else if (this.getSaldo() > 0) {
            JOptionPane.showMessageDialog(null, "Fechamento não realizado. Dinheiro em Conta");
        }
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}    