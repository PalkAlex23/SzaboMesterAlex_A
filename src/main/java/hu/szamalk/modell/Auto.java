package hu.szamalk.modell;

import java.text.Collator;
import java.util.UUID;

public class Auto extends Jarmu implements Comparable<Auto>{
    private UUID azonosito;
    private String nap;

    public Auto(String rendszam, Minosites minosites) {
        this(rendszam, minosites, "hétfő");
    }

    public Auto(String rendszam, Minosites minosites, String nap) {
        super(rendszam, minosites);
        this.azonosito = UUID.randomUUID();
        this.nap = nap;
    }



    @Override
    public String toString() {
        return super.toString() +
                "\n   Auto{" +
                "azonosito=" + azonosito +
                ", nap='" + nap + '\'' +
                '}';
    }

    @Override
    public int compareTo(Auto masik) {
        Collator collator = Collator.getInstance();
        return collator.compare(this.nap, masik.nap);
    }
}
