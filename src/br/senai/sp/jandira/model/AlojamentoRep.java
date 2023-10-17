package br.senai.sp.jandira.model;

import java.util.ArrayList;
import java.util.List;

public class AlojamentoRep extends Animais {

    List<AlojamentoRep> repteisList = new ArrayList<>();

    public void addRepteis(AlojamentoRep repteis) {
       repteisList.add(repteis);
    }

    public void listarMamiferos() {

        for (AlojamentoRep repteis : repteisList) {

            System.out.println(repteis.nome);
            System.out.println(repteis.idade);
            System.out.println(repteis.sexo);
            System.out.println(repteis.IDunica + "\n");

        }

    }

}
