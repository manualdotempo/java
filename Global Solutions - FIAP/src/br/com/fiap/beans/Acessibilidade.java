package br.com.fiap.beans;

public class Acessibilidade {
    private String altoContraste;
    private String leitorTela;
    private String libras;

    public Acessibilidade() {
    }

    public Acessibilidade(String altoContraste, String leitorTela, String libras) {
        this.altoContraste = altoContraste;
        this.leitorTela = leitorTela;
        this.libras = libras;
    }

    public String getAltoContraste() {
        return altoContraste;
    }

    public void setAltoContraste(String altoContraste) {
        this.altoContraste = altoContraste;
    }

    public String getLeitorTela() {
        return leitorTela;
    }

    public void setLeitorTela(String leitorTela) {
        this.leitorTela = leitorTela;
    }

    public String getLibras() {
        return libras;
    }

    public void setLibras(String libras) {
        this.libras = libras;
    }

    @Override
    public String toString() {
        return "\nACESSIBILIDADE" +
                "\nAltoContraste: " + altoContraste +
                "\nLeitor de Tela: " + leitorTela +
                "\nLibras: " + libras;
    }
}
