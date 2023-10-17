package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);
    Animais listAnimais = new Animais();
    AlojamentoMami listMamiferos = new AlojamentoMami();
    AlojamentoAves listAves = new AlojamentoAves();
    AlojamentoRep listRepteis = new AlojamentoRep();

    public void executarMenu(){

        boolean continuar = true;

        while (continuar) {


            System.out.println(" ------- Menu -------\n");
            System.out.println(" - 1 Cadastrar Animal ");
            System.out.println(" - 2 Informações sobre o Animal ");
            System.out.println(" - 3 Alojar Animal ");
            System.out.println(" - 4 Cadastrar Animal ");
            System.out.println(" - 5 Cadastrar Animal ");
            System.out.println(" - 6 Sair ");

            System.out.print("\n Digite a Opção Desejada: ");
            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {

                case 1:
                    Animais animais = new Animais();
                    animais.cadastrarAnimal();
                    listAnimais.addAnimal(animais);
                    System.out.println(" Animal Cadastrado!");
                    System.out.println(" Esse foi o " + listAnimais.animaisList.size() + "º animal Cadastrado!");


                    break;

                case 2:

                    listAnimais.listarAnimal();

                    break;

                case 3:
                    System.out.println("Digite o Id do Animal: ");
                    String animalPesquisado = scanner.nextLine();
                    boolean validaAnimal = false;

                    if (animalPesquisado != null && animalPesquisado != "" ){
                        validaAnimal = listAnimais.procurarAnimal(animalPesquisado);
                    }
                    if (validaAnimal){

                        System.out.println(" Qual tipo do animal? [ 1- Mamiferos  2- Aves  3- Repteis]");
                        int escolhaAlocar = scanner.nextInt();

                        switch (escolhaAlocar){

                            case 1:
                                AlojamentoMami mamifero = new AlojamentoMami();
                                listMamiferos.addMamifero(mamifero);
                                System.out.println("Mamifero" + mamifero.nome +  "Adicionado");
                                System.out.println("Temos" + listMamiferos.mamiferosList.size() + " Mamiferos");


                                break;

                            case 2:

                                AlojamentoAves aves = new AlojamentoAves();
                                listAves.addAves(aves);
                                System.out.println("Aves " + aves.nome +  " Adicionado");
                                System.out.println("Temos " + listAves.avesList.size() + " Aves");

                                break;

                            case 3:



                                break;

                        }
                    }


                    break;

                case 4:

                    break;

                case 5:

                    break;

                case 6:
                    continuar = false;

                    break;


            }

        }
    }
}
