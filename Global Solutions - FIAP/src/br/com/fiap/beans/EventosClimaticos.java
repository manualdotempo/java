package br.com.fiap.beans;

import java.util.Scanner;

public class EventosClimaticos {

    private Scanner entrada;

    public EventosClimaticos() {
        this.entrada = new Scanner(System.in);
    }

    public void exibirMenuPrincipal() {
        int opcao;

        do { // Loop para repetir o menu para o usuario
            System.out.println("\n----- COMO SE PREPARAR EM EVENTOS CLIMÁTICOS EXTREMOS -----" +
                                "\nEscolha uma opção para ver as dicas:" +
                                "\n1 - Ondas de Calor" +
                                "\n2 - Frio Extremo" +
                                "\n3 - Chuva / Enchentes" +
                                "\n4 - Ventos Fortes" +
                                "\n0 - Sair do sistema" +
                                "\nDigite sua opção: ");

            if (entrada.hasNextInt()) {
                opcao = entrada.nextInt();
                entrada.nextLine(); // limpa linha anterior

                switch (opcao) {
                    case 1:
                        // instanciando obj
                        DicasOndasDeCalor objDicasOndasDeCalor = new DicasOndasDeCalor();
                        // chama metodo p apresentar as dicas
                        objDicasOndasDeCalor.exibirDicasOndasDeCalor();
                        break;
                    case 2:
                        DicasFrioExtremo objDicasFrioExtremo = new DicasFrioExtremo();
                        objDicasFrioExtremo.exibirDicasFrioExtremo();
                        break;
                    case 3:
                        DicasChuvaEnchentes objDicasChuvaEnchentes = new DicasChuvaEnchentes();
                        objDicasChuvaEnchentes.exibirDicasChuvaEnchentes();
                        break;
                    case 4:
                        DicasVentosFortes objDicasVentosFortes = new DicasVentosFortes();
                        objDicasVentosFortes.exibirDicasVentosFortes();
                        break;
                    case 0:
                        System.out.println("Encerrando o sistema de dicas. Cuide-se!");
                        break;
                    default:
                        System.out.println("Opção inválida! Por favor, tente novamente.");
                }
            } else {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                entrada.nextLine(); // limpa entrada inválida
                opcao = -1;
            }
            System.out.println("-------------------------------------------------");
        } while (opcao != 0);
    }

    public void fecharScanner() {
        if (this.entrada != null) {
            this.entrada.close();
        }
    }
}