package br.senai.sp.jandira.model;

public class Mamiferos extends Animais {

    AlojamentoMami alojamentos = new AlojamentoMami();

    public void cadastrarMamiferos() {

        System.out.println(" | ------- Cadastro de Mamiferos ------- |");
        super.cadastrarAnimal();

    }

}
