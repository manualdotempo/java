package br.com.fiap.beans;

public class Feedback {
    private int nota;
    private String comentario;

    public Feedback() {
    }

    public Feedback(int nota, String comentario) {
        this.nota = nota;
        this.comentario = comentario;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    @Override
    public String toString() {
        return "\nFeedback" +
                "\n\nNota: " + nota +
                "\nComentario: " + comentario;
    }
}
