package d14_01_22;

public class Knjiga {
	private String isbn;
	private String naziv;
	private int godinaIzdanja;
	private Autor autor;
	
	public Knjiga(String isbn,String naziv,int godinaIzdanja) {
		
		this.isbn=isbn;
		this.naziv=naziv;
		this.godinaIzdanja=godinaIzdanja;
		
	}
	 
	public String getIsbn()
	{
		return this.isbn;
	}
	public String getNaziv()
	{
		return this.naziv;
	}
	public int getGodinaIzdanja()
	{
		return this.godinaIzdanja;
	}
	
	public Autor getAutor()
	{
		return this.getAutor();
	}
	public void setAutor(Autor autor)
	{
		this.autor=autor;
	}
	public void stampaj()
	{
		System.out.println(this.isbn);
		System.out.println(this.naziv+" - "+ this.godinaIzdanja);
		System.out.print("Autor: ");
		this.autor.print();
		System.out.println();
	}
}
