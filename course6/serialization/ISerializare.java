package ro.ase.course6.serialization;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public interface ISerializare {
	
	public void SerializareObiect(DataOutputStream dos) throws IOException;
	
	public void DeserializareObiect(DataInputStream dis) throws IOException;
}
