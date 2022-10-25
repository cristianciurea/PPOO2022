package ro.ase.course7.designpatterns.factory;

public class StudentMaster extends Student {
    @Override
    public void afisareStudent() {
        System.out.println("Afisare student master");
    }

    public StudentMaster(String nume) {
        this.nume = nume;
    }
}

