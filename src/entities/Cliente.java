package entities;

public class Cliente extends Pessoa {

    public Cliente() {
        super();
    }

    public Cliente(String nome, String cpf, String email) {
        super(nome, cpf, email);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}