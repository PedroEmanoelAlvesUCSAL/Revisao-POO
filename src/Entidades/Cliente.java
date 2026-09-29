package Entidades;

public class Cliente {
    private String nome;
    private String email;
    private String dataNascimento;

    public Cliente(String nome, String email, String dataNascimento) {
        this.nome = nome;
        this.email = email;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }


    public String getDataNascimento() {
        return dataNascimento;
    }

    @Override
    public String toString() {
        return "Cliente: " + nome + " (" + dataNascimento + ") - " + email;
    }
}
