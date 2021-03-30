package com.company;

import Model.Bilet;
import Model.Client;
import Model.Persoana;
import Service.BiletS;

public class Main {

    public static void main(String[] args) {
        Bilet bilet = new Bilet();
        Persoana persoana=new Client();
        persoana.setNume("Vasu");
        persoana.setPrenume("Ionut");
        persoana.setVarsta(22);

        bilet.setPret(50);
        bilet.setId_bilet(1);
        bilet.setPersoana(persoana);

        BiletS actiune=new BiletS();
        actiune.adaugaBilet(bilet);
        System.out.println(actiune.detaliiDespreBiletCuIdul(1).toString());
    }
}
