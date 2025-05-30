package hu.szamalk.modell;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Kolcsonzo {
    List<Jarmu> jarmuvek;

    public Kolcsonzo() {
        this.jarmuvek = new ArrayList<>();

        jarmuvek.add(new Auto("IHX-700", Minosites.KIVALO, "szerda"));
        jarmuvek.add(new Auto("KNB-553", Minosites.ATLAGOS));
        jarmuvek.add(new Hajo("IKS-210", Minosites.KIVALO, "Valami-1", 150));
        jarmuvek.add(new Hajo("145-KE", Minosites.KIVALO, "Valami-2", 70));
    }

    public List<Jarmu> getJarmuvek() {
        return Collections.unmodifiableList(jarmuvek);
    }

    public void megjelenit() {
        for(Jarmu jarmu : jarmuvek) {
            System.out.println(jarmu.toString());
        }
    }
}
