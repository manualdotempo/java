package br.com.fiap.beans;

public abstract class Pessoa {
    private String nome;
    private String dataNascimento;
    private String email;
    private String telefone;

    public Pessoa() {
    }

    public Pessoa(String nome, String dataNascimento, String email,String telefone) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "\nPESSOA" +
                "\n\nNome: " + nome +
                "\nData de Nascimento: " + dataNascimento +
                "\nEmail: " + email +
                "\nTelefone: " + telefone;
    }

    public abstract String identificador();
}
