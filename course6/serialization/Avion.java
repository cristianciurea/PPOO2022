package ro.ase.course6.serialization;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Avion implements ISerializare {

	private int viteza;
	private int nrLocuri;
	private Pilot pilot;
	
	public Avion()
	{
		pilot = new Pilot(0, "Gigel");
	}
	
	public Avion(int v, int nl, int varsta, String n)
	{
		viteza = v;
		nrLocuri = nl;
		pilot = new Pilot(varsta, n);
	}

	@Override
	public String toString() {
		return "Avion are viteza=" + viteza + " nrLocuri " + nrLocuri
				+ " si un pilot cu varsta " + pilot.getVarsta() + " si numele "+pilot.getNume();
	}

	@Override
	public void SerializareObiect(DataOutputStream dos) throws IOException {
		// TODO Auto-generated method stub
		dos.writeInt(viteza);
		dos.writeInt(nrLocuri);
		pilot.SerializareObiect(dos);
	}

	@Override
	public void DeserializareObiect(DataInputStream dis) throws IOException {
		// TODO Auto-generated method stub
		viteza = dis.readInt();
		nrLocuri = dis.readInt();
		pilot.DeserializareObiect(dis);
	}

	public int getViteza() {
		return viteza;
	}

	public void setViteza(int viteza) {
		this.viteza = viteza;
	}

	public int getNrLocuri() {
		return nrLocuri;
	}

	public void setNrLocuri(int nrLocuri) {
		this.nrLocuri = nrLocuri;
	}

	public Pilot getPilot() {
		return pilot;
	}

	public void setPilot(Pilot pilot) {
		this.pilot = pilot;
	}
}
