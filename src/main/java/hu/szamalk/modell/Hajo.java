package hu.szamalk.modell;

public class Hajo extends Jarmu {
    private String nev;
    private int ferohely;

    public Hajo(String rendszam, Minosites minosites, String nev, int ferohely) {
        super(rendszam, minosites);
        this.nev = nev;
        this.ferohely = ferohely;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n   Hajo{" +
                "nev='" + nev + '\'' +
                ", ferohely=" + ferohely +
                '}';
    }
}
