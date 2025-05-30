package hu.szamalk.modell;

public class NincsRendszamException extends RuntimeException {
    public NincsRendszamException() {
        System.out.println("Nincsen rendszáma az autónak!");
    }
}
