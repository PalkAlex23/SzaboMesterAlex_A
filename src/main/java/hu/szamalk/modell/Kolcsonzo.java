package hu.szamalk.modell;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Kolcsonzo implements Serializable {
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

    public void kiiras() {
        Jarmu jarmu = new Auto("XLS-420", Minosites.ATLAGOS);
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("jarmuvek.txt"));
            oos.writeObject(jarmu);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void beolvas() {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("jarmuvek.txt"));
            Jarmu jarmu = (Jarmu) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
