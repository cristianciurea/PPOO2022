package ro.ase.course7.designpatterns.singleton;

public class Singleton {
    private static Singleton instanta = null;

    private Singleton() {

    }

    public static Singleton getInstanta() {
        if (instanta == null) {
            instanta = new Singleton();
        }
        return instanta;
    }
}
