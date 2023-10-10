package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);
    Animais animais = new Animais();
    AlojamentoMami listMamiferos = new AlojamentoMami();

    public void executarMenu(){

        System.out.println(" ------- Menu -------\n");
        System.out.println(" - 1 Cadastrar Animal ");
        System.out.println(" - 2 Cadastrar Animal ");
        System.out.println(" - 3 Cadastrar Animal ");
        System.out.println(" - 4 Cadastrar Animal ");
        System.out.println(" - 5 Cadastrar Animal ");

        int escolha = scanner.nextInt();
        scanner.nextLine();

        switch (escolha){

            case 1:
                Mamiferos mamiferos = new Mamiferos();
                mamiferos.cadastrarAnimal();


                break;

            case 2:

                break;

        }

    }
}
