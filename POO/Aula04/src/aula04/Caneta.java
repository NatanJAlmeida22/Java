package aula04;
public class Caneta {
    public String modelo;
    private float ponta;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }
    
    public void status(){
        System.out.println("Sobre a Caneta: ");
        System.out.println("Modelo " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
    }
}
