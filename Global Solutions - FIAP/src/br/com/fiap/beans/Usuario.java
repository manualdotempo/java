package br.com.fiap.beans;

public class Usuario extends Pessoa{
    private String cidade;
    private String estado;

    public Usuario() {
    }

    public Usuario(String nome, String dataNascimento, String email, String telefone, String cidade, String estado) {
        super(nome, dataNascimento, email, telefone);
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "\nUSUARIO" +
                super.toString() +
                "\nCidade: " + cidade +
                "\nEstado: " + estado;
    }

    @Override
    public String identificador(){
        return "USUARIO";
    }
}
