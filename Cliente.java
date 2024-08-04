package lavaCar;

public class Cliente extends Pessoa {
    private String carro;

    public Cliente(String nome, int idade, String carro) {
        super(nome, idade);
        this.carro = carro;
    }

    public String getCarro() {
        return carro;
    }

    public void setCarro(String carro) {
        this.carro = carro;
    }

    @Override
    public String toString() {
        return super.toString() + ", Carro: " + carro;
    }
}

