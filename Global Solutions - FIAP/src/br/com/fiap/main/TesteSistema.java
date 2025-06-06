package br.com.fiap.main;

import br.com.fiap.beans.*;

import javax.swing.*;

public class TesteSistema {

    static String texto(String j){
        return JOptionPane.showInputDialog(j);
    }
    static int inteiro(String j){
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }
    static Double real(String j){
        return Double.parseDouble(JOptionPane.showInputDialog(j));
    }

    public static void main(String[] args) {

        //String nome, String dataNascimento, String email,String telefone, String cidade, String estado
        Usuario objUsuario = new Usuario(
                texto("Informe seu Nome: "),
                texto("Informe sua Data de Nascimento: "),
                texto("Informe seu email: "),
                texto("Informe seu telefone"),
                texto("Informe seu cidade: "),
                texto("Informe sua estado")
        );

        PessoaEmergencia objPessoaEmergencia  = new PessoaEmergencia(
                texto("Informe o Nome (CONTATO DE EMERGENCIA): "),
                texto("Informe a Data de Nascimento (CONTATO DE EMERGENCIA): "),
                texto("Informe o email (CONTATO DE EMERGENCIA): "),
                texto("Informe o telefone (CONTATO DE EMERGENCIA): "),
                texto("Informe seu grau de parentesco (CONTATO DE EMERGENCIA): ")
        );

        //int nota, String comentario
        Feedback objFeedback = new Feedback(
                inteiro("Digite sua nota (0 a 10): "),
                texto("Sugestoes: ")
        );

        //String Pergunta
        Pergunta objPergunta = new Pergunta(
                texto("Ficou com alguma duvida? \nFaca sua pergunta: ")
        );


        //String nome, String endereco, String avaliacao, String recursos
        LocalSeguro objLocalseguro = new LocalSeguro();
                objLocalseguro.setNome("CRAS Mooca");
                objLocalseguro.setEndereco("Rua Taquari, 549 – Mooca");
                objLocalseguro.setAvaliacao("⭐⭐⭐⭐☆ (4,2 no Google)");;
                objLocalseguro.setRecursos("abrigo, alimentação básica, proteção contra frio");


        //String nome, String endereco
        LocalSeguro objLocalseguro2 = new LocalSeguro();
                objLocalseguro2.setNome("Casa de Passagem da Prefeitura (Centro)");
                objLocalseguro2.setEndereco("R. do Glicério, 420 – Liberdade");
                objLocalseguro2.setAvaliacao(" ⭐⭐⭐⭐☆ (4,1 no Google)");
                objLocalseguro2.setRecursos(" abrigo, alimentação, banho, suporte social");


        LocalSeguro objLocalseguro3 = new LocalSeguro();
                objLocalseguro3.setNome("Centro Esportivo Tietê");
                objLocalseguro3.setEndereco(" Av. Santos Dumont, 843 – Luz");
                objLocalseguro3.setAvaliacao(" ⭐⭐⭐⭐☆ (4,3 no Google)");
                objLocalseguro3.setRecursos(" espaço amplo coberto, alimentação emergencial, banheiro");


        LocalSeguro objLocalseguro4 = new LocalSeguro();
                objLocalseguro4.setNome("Terminal Rodoviário Tietê (emergencial)");
                objLocalseguro4.setEndereco("Av. Cruzeiro do Sul, 1800 – Santana");
                objLocalseguro4.setAvaliacao(" ⭐⭐⭐☆☆ (3,9 no Google)");
                objLocalseguro4.setRecursos(" acesso a transporte, bancos, abrigo parcial");


        //String altoContraste, String leitorTela, String libras
        Acessibilidade objAcessibilidade = new Acessibilidade(
                texto("Deseja ativar alto contraste? "),
                texto("Deseja ativar o leitor de tela? "),
                texto("Deseja ativar a Acessibilidade em Libras? ")
        );

        System.out.println(
                        "\n" +
                        objUsuario + "\n" +
                        objPessoaEmergencia + "\n" +
                        objLocalseguro + "\n" +
                        objLocalseguro2 + "\n" +
                        objLocalseguro3 + "\n" +
                        objLocalseguro4 + "\n" +
                        objAcessibilidade + "\n" +
                        objFeedback + "\n" +
                        objPergunta);



        //Adicionando chamadas p/ o SISTEMA PRINCIPAL (classe EventosClimaticos)

        System.out.println("\n\n\n>>> Iniciando Sistema Principal <<<");

        // Instanciando objeto
        EventosClimaticos objEventoClimatico = new EventosClimaticos();

        // Chamar o metodo p exibir menu
        objEventoClimatico.exibirMenuPrincipal();

        //Funcao p fechar Scanner
        objEventoClimatico.fecharScanner();

        System.out.println("\n>>> Sistema Principal Encerrado <<<");


    }
}






