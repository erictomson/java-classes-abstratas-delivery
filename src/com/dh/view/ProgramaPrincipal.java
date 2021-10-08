package com.dh.view;

import com.dh.domain.Bolo;
import com.dh.domain.Massa;
import com.dh.domain.Sanduiche;

import java.util.Scanner;

public class ProgramaPrincipal {

    public static void main(String[] args) {

        int opcao;

        System.out.println("Escolha uma das opções abaixo");
        System.out.println("1. Sanduiches");
        System.out.println("2. Massas");
        System.out.println("3. Bolos");

        // Usando Try with Resources para fechar o objeto Scanner
        // ao final da execução do bloco protegido
        // Dispensa uso do Finally
        try(Scanner scanner = new Scanner(System.in)) {
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // Usando Enhanced For
                    for (String ingrediente : Sanduiche.INGREDIENTES_DISPONIVEIS) {
                        System.out.println(ingrediente);
                    }
                    break;
                case 2:
                    // Usando uma interface funcional consumer da Collection
                    Massa.CARDAPIO_DE_MASSAS.forEach(massa -> System.out.println(massa));
                    // Usando Lambda Expression
                    Massa.CARDAPIO_DE_MASSAS.forEach(System.out::println);
                    break;
                case 3:
                    // Usando Stram
                    Bolo.CARDAPIO_DE_BOLOS.stream().forEach(bolo -> System.out.println(bolo));
                    Bolo.CARDAPIO_DE_BOLOS.stream().forEach(System.out::println);
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
//        } finally {
//            // Fechando o Scanner
//            scanner.close();
        }
    }
}
