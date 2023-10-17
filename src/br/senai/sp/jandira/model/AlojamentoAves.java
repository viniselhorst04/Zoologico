package br.senai.sp.jandira.model;

import java.util.ArrayList;
import java.util.List;

public class AlojamentoAves extends Animais {

    List<AlojamentoAves> avesList = new ArrayList<>();

    public void addAves(AlojamentoAves aves) {
        avesList.add(aves);
    }

    public void listarMamiferos() {

        for (AlojamentoAves aves : avesList) {

            System.out.println(aves.nome);
            System.out.println(aves.idade);
            System.out.println(aves.sexo);
            System.out.println(aves.IDunica + "\n");

        }

    }
}