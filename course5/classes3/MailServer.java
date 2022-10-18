package ro.ase.course5.classes3;

import java.util.ArrayList;

public class MailServer {

	static ArrayList<Persoana> senders = new ArrayList<Persoana>(100);

	public void sendAllSubmissions()
	{
		for (Persoana p: senders)
		{
			p.faceCeva("tema generala");
		}
	}
}
