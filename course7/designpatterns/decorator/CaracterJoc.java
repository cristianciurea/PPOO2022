package ro.ase.course7.designpatterns.decorator;

public class CaracterJoc implements InterfataCaracterJoc{

    protected String nume;
    protected int puncteViata;

    public CaracterJoc(String nume, int puncteViata) {
        this.nume = nume;
        this.puncteViata = puncteViata;
    }

    @Override
    public String getNume() {
        return this.nume;
    }

    @Override
    public int getPuncteViata() {
        return this.puncteViata;
    }

    @Override
    public void getDescriere() {
        System.out.println("Supereroul "+this.nume+" are "+this.puncteViata+ " puncte viata");
    }

    @Override
    public void esteAtacat(int puncte) {
        this.puncteViata-=puncte;
    }

    @Override
    public void seVindeca(int puncte) {
        this.puncteViata+=puncte;
    }
}
