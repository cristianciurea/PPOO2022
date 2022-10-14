package ro.ase.course4.seminar4;

enum tipVehicul {MASINA, CAMION, TRACTOR}

public abstract class Vehicul {

    private int nrRoti;
    private int nrUsi;
    private tipVehicul tip;

    public Vehicul(int nrRoti, int nrUsi, tipVehicul tip) {
        this.nrRoti = nrRoti;
        this.nrUsi = nrUsi;
        this.tip = tip;
    }

    public int getNrRoti() {
        return nrRoti;
    }

    public void setNrRoti(int nrRoti) {
        this.nrRoti = nrRoti;
    }

    public int getNrUsi() {
        return nrUsi;
    }

    public void setNrUsi(int nrUsi) {
        this.nrUsi = nrUsi;
    }

    public tipVehicul getTip() {
        return tip;
    }

    public void setTip(tipVehicul tip) {
        this.tip = tip;
    }

    @Override
    public String toString() {
        return "Vehicul{" +
                "nrRoti=" + nrRoti +
                ", nrUsi=" + nrUsi +
                ", tip=" + tip +
                '}';
    }

    abstract String spuneMarca();
}
