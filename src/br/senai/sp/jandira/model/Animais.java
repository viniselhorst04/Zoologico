package br.senai.sp.jandira.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Animais {

    public String nome,sexo;
    int idade, IDunica,tipoAnimal;
    Scanner scanner = new Scanner(System.in);
    List<Animais> animaisList = new ArrayList<>();

    public void cadastrarAnimal(){


        System.out.print("\n Nome: ");
        nome = scanner.nextLine();
        System.out.print(" Sexo: ");
        sexo = scanner.nextLine();
        System.out.print(" Idade: ");
        idade = scanner.nextInt();
        System.out.print(" ID do Animal: ");
        IDunica = scanner.nextInt();
        scanner.nextLine();


    }

    public void addAnimal(Animais animais){
        animaisList.add(animais);
    }

    public void listarAnimal (){
        for (Animais animais : animaisList ) {

            System.out.println(animais.nome);
            System.out.println(animais.idade);
            System.out.println(animais.sexo);
            System.out.println(animais.IDunica + "\n");

        }
    }

    public boolean procurarAnimal(String animalPesquisado){
        for (Animais animais : animaisList) {
            if (animais.nome.equalsIgnoreCase(animalPesquisado)){
                return true;

            }
        }

        return false;
    }

    public int getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(int tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIDunica() {
        return IDunica;
    }

    public void setIDunica(int IDunica) {
        this.IDunica = IDunica;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }
}
