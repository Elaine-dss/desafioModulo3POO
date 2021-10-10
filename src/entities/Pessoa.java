package entities;

public abstract class Pessoa {

    protected String nome, cpf, email;

    public Pessoa() {}

    public Pessoa(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "\n|  Nome: " + nome
                + "\n|  CPF: " + cpf
                + "\n|  Email: " + email
                + "\n|";
    }
}
