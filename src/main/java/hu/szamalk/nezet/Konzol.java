package hu.szamalk.nezet;

import hu.szamalk.modell.Kolcsonzo;

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

    private static void jarmuvekFajlban() {
    }

    private static void melyikNaponMelyikAuto() {
    }

}
