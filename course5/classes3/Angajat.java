package ro.ase.course5.classes3;

public class Angajat extends Persoana implements ICanEnrol,ICanSubmit{

	@Override
	public void faceCeva(String tema) {
		System.out.println("O companie trimite "+tema);
	}
	
	@Override
	public void inregistreaza()
	{
		System.out.println("O companie trimite o aplicatie");
	}
	
	@Override
	public void trimite()
	{
		System.out.println("O companie trimite un raport");
	}

	private String prenume;
	private Categorie categ;
	
	public enum Categorie {PARTTIME, FULLTIME}

	public Angajat(String id, String nume, String prenume, Categorie categ) {
		super(id, nume);
		this.prenume = prenume;
		this.categ = categ;
	}

	public String getPrenume() {
		return prenume;
	}

	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	public Categorie getCateg() {
		return categ;
	}

	public void setCateg(Categorie categ) {
		this.categ = categ;
	};	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Angajatul cu id "+this.getId()+" are numele "+nume+" prenumele "+prenume+" si categoria "+categ;
	}
}
