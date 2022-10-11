package ro.ase.seminar1.exemplu;

public class Masina extends Vehicul implements IVanzare, Comparable{

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
}
