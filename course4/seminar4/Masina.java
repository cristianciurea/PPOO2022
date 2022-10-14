package ro.ase.course4.seminar4;

import ro.ase.course4.seminar4.IVanzare;
import ro.ase.course4.seminar4.Vehicul;
import ro.ase.course4.seminar4.tipVehicul;

import java.util.Arrays;
import java.util.Objects;

public class Masina extends Vehicul implements IVanzare, Comparable, Cloneable{

    private String marca;
    private int pret;
    private int anFabricatie;
    private String culoare;
    private String motorizare;

    public float[] getPreturiRevizii() {
        return preturiRevizii;
    }

    public void setPreturiRevizii(float[] preturiRevizii) {
        this.preturiRevizii = preturiRevizii;
    }

    private float[] preturiRevizii;

    public Masina(int nrRoti, int nrUsi, tipVehicul tip, String marca, int pret,
                  int anFabricatie, String culoare, String motorizare, float[] preturi) {
        super(nrRoti, nrUsi, tip);
        this.marca = marca;
        this.pret = pret;
        this.anFabricatie = anFabricatie;
        this.culoare = culoare;
        this.motorizare = motorizare;
        this.preturiRevizii = preturi;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    public int getAnFabricatie() {
        return anFabricatie;
    }

    public void setAnFabricatie(int anFabricatie) {
        this.anFabricatie = anFabricatie;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public String getMotorizare() {
        return motorizare;
    }

    public void setMotorizare(String motorizare) {
        this.motorizare = motorizare;
    }

    @Override
    public String toString() {
        String result = "";

        result+= "Masina{" +
                "marca='" + marca + '\'' +
                ", pret=" + pret +
                ", anFabricatie=" + anFabricatie +
                ", culoare='" + culoare + '\'' +
                ", motorizare='" + motorizare + '\'' +
                "} " + super.toString() + "\n";

        result+=" preturi revizii: ";
        for(int i=0;i<preturiRevizii.length;i++)
            result+= preturiRevizii[i]+", ";

        return result;
    }

    @Override
    String spuneMarca() {

        String result = "";
        switch (this.getTip())
        {
            case MASINA:
                result="Dacia";
                break;
            case CAMION:
                result="Iveco";
                break;
            case TRACTOR:
                result = "John Deere";
        }

        return result;
    }

    @Override
    public float calculPretVanzare() {
        return (float)(pret*1.19);
    }

    @Override
    public int compareTo(Object o) {
        Masina m = (Masina)o;
        if(this.pret < m.pret)
            return -1;
        else
            if(this.pret > m.pret)
                return 1;
            else
                return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Masina masina = (Masina) o;
        return pret == masina.pret && anFabricatie == masina.anFabricatie && marca.equals(masina.marca) && culoare.equals(masina.culoare) && motorizare.equals(masina.motorizare) && Arrays.equals(preturiRevizii, masina.preturiRevizii);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(marca, pret, anFabricatie, culoare, motorizare);
        result = 31 * result + Arrays.hashCode(preturiRevizii);
        return result;
    }

    @Override
    protected Masina clone() throws CloneNotSupportedException {
        return (Masina) super.clone();
    }
}
