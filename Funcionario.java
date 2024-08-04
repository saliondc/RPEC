package lavaCar;

public class Funcionario extends Pessoa {
    private String cargo;

    public Funcionario(String nome, int idade, String cargo) {
        super(nome, idade);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return super.toString() + ", Cargo: " + cargo;
    }
}

