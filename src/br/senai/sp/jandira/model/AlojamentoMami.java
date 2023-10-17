package br.senai.sp.jandira.model;

import java.util.ArrayList;
import java.util.List;


public class AlojamentoMami extends Animais {


    List<AlojamentoMami> mamiferosList = new ArrayList<>();
    public void addMamifero(AlojamentoMami mamiferos){
        mamiferosList.add(mamiferos);
    }

    public void listarMamiferos(){

        for (AlojamentoMami mamiferos : mamiferosList ) {

            System.out.println(mamiferos.nome);
            System.out.println(mamiferos.idade);
            System.out.println(mamiferos.sexo);
            System.out.println(mamiferos.IDunica + "\n");

        }
    }



}
