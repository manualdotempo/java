package br.com.fiap.beans;

public class PessoaEmergencia extends Pessoa {
    private String grauParentesco;

    public PessoaEmergencia() {
    }

    public PessoaEmergencia(String nome, String dataNascimento, String email, String telefone, String grauParentesco) {
        super(nome, dataNascimento, email, telefone);
        this.grauParentesco = grauParentesco;
    }

    public String getGrauParentesco() {
        return grauParentesco;
    }

    public void setGrauParentesco(String grauParentesco) {
        this.grauParentesco = grauParentesco;
    }

    @Override
    public String toString() {
        return "\nContato de Emergencia" +
                super.toString() +
                "\nGrau de Parentesco" + grauParentesco;
    }

    @Override
    public String identificador(){
        return "Emergencia";
    }
}
