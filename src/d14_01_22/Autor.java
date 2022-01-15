package d14_01_22;

public class Autor {
	private String ime;
	private String prezime;
	
	public Autor(String ime,String prezime)
	{
		this.ime=ime;
		this.prezime=prezime;
	}
	
	public String getIme()
	{
		return this.ime;
	}
	public String getPrezime()
	{
		return this.prezime;
	}
	
	public void print()
	{
		System.out.println(this.ime+ " "+this.prezime);
	}
}
