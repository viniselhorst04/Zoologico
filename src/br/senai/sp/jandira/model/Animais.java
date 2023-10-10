package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Animais {

    String nome,sexo;
    int idade, IDunica,tipoAnimal;


    Scanner scanner = new Scanner(System.in);

    public void cadastrarAnimal(){


        System.out.print("\n  Nome:");
        nome = scanner.nextLine();
        System.out.print(" Sexo:");
        sexo = scanner.nextLine();
        System.out.print(" Idade:");
        idade = scanner.nextInt();
        System.out.print(" ID do Animal");
        IDunica = scanner.nextInt();
        System.out.println(" Tipo do animal : [ 1- Mamifero  2- Aves  3-Repteis");
        tipoAnimal = scanner.nextInt();
        scanner.nextLine();


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
