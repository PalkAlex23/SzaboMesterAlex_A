package hu.szamalk.nezet;

import hu.szamalk.modell.Kolcsonzo;

import java.io.File;
import java.nio.file.Path;

public class Konzol {
    public static void main(String[] args) {
        feladatok();
    }

    private static void feladatok() {
        jarmuvekKonzolon();
        //jarmuvekFajlban();
        //melyikNaponMelyikAuto();
    }

    private static void jarmuvekKonzolon() {
        Kolcsonzo kolcsonzo = new Kolcsonzo();
        System.out.println(" - Kölcsönző járművei:");
        kolcsonzo.megjelenit();
    }

    /*
    private static void jarmuvekFajlban() {
        Kolcsonzo kolcsonzo = new Kolcsonzo();
        kolcsonzo.kiiras();
        kolcsonzo.beolvas();
    }
    */

    /*private static void melyikNaponMelyikAuto() {
    }*/

}
