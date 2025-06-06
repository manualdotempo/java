package br.com.fiap.beans;

public class LocalSeguro {
   public String nome;
   public String endereco;
   public String avaliacao;
   public String recursos;

    public LocalSeguro() {
    }

    public LocalSeguro(String nome, String endereco, String avaliacao, String recursos) {
        this.nome = nome;
        this.endereco = endereco;
        this.avaliacao = avaliacao;
        this.recursos = recursos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setAvaliacao(String avaliacao) {
        this.avaliacao = avaliacao;
    }

    public void setRecursos(String recursos) {
        this.recursos = recursos;
    }

    @Override
    public String toString() {
        return "\nLOCAL SEGURO" +
                "\n\nNome: " + nome +
                "\nEndereco: " + endereco +
                "\nAvaliacao: " + avaliacao +
                "\nRecursos: " + recursos;
    }
}
