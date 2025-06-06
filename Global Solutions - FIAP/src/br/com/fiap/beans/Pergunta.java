package br.com.fiap.beans;

public class Pergunta {
    private String pergunta;

    public Pergunta() {
    }

    public Pergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    @Override
    public String toString() {
        return "\nPergunta" +
                "\nPergunta: " + pergunta;
    }
}
