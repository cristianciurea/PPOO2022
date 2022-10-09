package ro.ase.course3.classes1;

import java.util.Date;

public class Carte 
{
	String autor;
	String titlu;
	Date dataAparitiei;
	String editura;
	private String isbn;
	float pret;
	Gen gen;
	
	public enum Gen {ACTIUNE, DRAMA, ROMANTIC, SF, NEDEFINIT}
	
	public Carte()
	{
		this.autor = "Anonim";
		this.titlu = "Fara titlu";
		this.dataAparitiei = new Date();
		this.editura = "ASE";
		this.isbn = "123456789";
		this.pret = 0.0f;
		this.gen = Gen.NEDEFINIT;
	};
	
	public Carte(String autor, String titlu, Date dataAparitiei,
			String editura, String isbn, float pret, Gen gen) {
		super();
		this.autor = autor;
		this.titlu = titlu;
		this.dataAparitiei = dataAparitiei;
		this.editura = editura;
		this.isbn = isbn;
		this.pret = pret;
		this.gen = gen;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getTitlu() {
		return titlu;
	}
	public void setTitlu(String titlu) {
		this.titlu = titlu;
	}
	public Date getDataAparitiei() {
		return dataAparitiei;
	}
	public void setDataAparitiei(Date dataAparitiei) {
		this.dataAparitiei = dataAparitiei;
	}
	public String getEditura() {
		return editura;
	}
	public void setEditura(String editura) {
		this.editura = editura;
	}
	public float getPret() {
		return pret;
	}
	public void setPret(float pret) {
		this.pret = pret;
	}
	public Gen getGen() {
		return gen;
	}
	public void setGen(Gen gen) {
		this.gen = gen;
	}
	String getIsbn() {
		return isbn;
	}
	void setIsbn(String isbn) {
		this.isbn = isbn;
	}


   public static void main(String[] args) {
         
         String [] opt = {"ACTIUNE", "DRAMA", "ROMANTIC", "SF", "NEDEFINIT"};
         
         Carte c1 = new Carte();
         Carte c2 = new Carte("Eminescu", "Poezii", new Date(), "ASE", "123456789", 120.0f, Gen.valueOf(opt[2]));
         
         System.out.println(c2.getAutor() + " " + c2.getTitlu() + " " + c2.getDataAparitiei() + " " + c2.getEditura() + " " + c2.getIsbn() + " " + c2.getPret() + " " +  c2.getGen());
     
         ListaCarti bibl = new ListaCarti();
         bibl.adaugaCarte(c1);
         bibl.adaugaCarte(c2);
         
         System.out.println("Lista cartilor adaugate este:"+"\n" + bibl.toString());
     }
}
