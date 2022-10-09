package ro.ase.course3.classes1;

import java.util.ArrayList;

public class ListaCarti {
	
	static ArrayList<Carte> lista;// = new ArrayList<Carte>(100);
	
	public ListaCarti()
	{
		lista = new ArrayList<Carte>(100);
	}

	public void adaugaCarte(Carte carte) 
	{
		lista.add(carte);
	}
	
	public String toString()
	{
		StringBuilder carti = new StringBuilder();
		
		for(Carte c:lista)
		{
			carti.append(c.getAutor());
			carti.append(" ");
			carti.append(c.getTitlu());
			carti.append(" ");
			carti.append(c.getDataAparitiei());
			carti.append(" ");
			carti.append(c.getEditura());
			carti.append(" ");
			carti.append(c.getIsbn());
			carti.append(" ");
			carti.append(c.getPret());
			carti.append(" ");
			carti.append(c.getGen());
			carti.append("\n");
		}
		return carti.toString();	
	}
}
