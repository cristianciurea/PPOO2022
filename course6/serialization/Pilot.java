package ro.ase.course6.serialization;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Pilot implements ISerializare {

	private int varsta;
	private String nume;
	
	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public int getVarsta() {
		return varsta;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public Pilot() 
	{
		varsta = 0;
		nume = null;
	}
	
	public Pilot(int v, String n){
		varsta = v;
		nume = n;
	}

	@Override
	public String toString() {
		return "Pilotul are varsta=" + varsta + " si numele "+nume;
	}

	@Override
	public void SerializareObiect(DataOutputStream dos) throws IOException {
		// TODO Auto-generated method stub
		dos.writeInt(varsta);
		dos.writeUTF(nume);
	}

	@Override
	public void DeserializareObiect(DataInputStream dis) throws IOException {
		// TODO Auto-generated method stub
		varsta = dis.readInt();
		nume = dis.readUTF();
	}
}
