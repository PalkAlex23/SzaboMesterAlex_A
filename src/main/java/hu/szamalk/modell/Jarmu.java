package hu.szamalk.modell;

import java.io.*;
import java.util.Objects;

public class Jarmu {
    private String rendszam;
    private Minosites minosites;

    public Jarmu(String rendszam, Minosites minosites) {
        if(Objects.equals(rendszam, "-")) {
            throw new NincsRendszamException();
        }
        this.rendszam = rendszam;
        this.minosites = minosites;
    }

    public String getRendszam() {
        return rendszam;
    }

    public void setRendszam(String rendszam) {
        this.rendszam = rendszam;
    }

    public Minosites getMinosites() {
        return minosites;
    }

    public void setMinosites(Minosites minosites) {
        this.minosites = minosites;
    }

    @Override
    public String toString() {
        return "Jarmu{" +
                "rendszam='" + rendszam + '\'' +
                ", minosites=" + minosites +
                '}';
    }
}
