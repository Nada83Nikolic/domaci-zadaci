package d14_01_22_zadatak_2;

public class Proizvod {
	private int sifra;
	private String naziv;
	private double cenaPoKg;
	
	public Proizvod(int sifra, String naziv, double cenaPoKg)
	{
		this.sifra=sifra;
		this.naziv=naziv;
		this.cenaPoKg=cenaPoKg;
	}

	public int getSifra()
	{
		return this.sifra;
	}
	public void setSifra(int sifra)
	{
		this.sifra=sifra;
	}
	
	public String getNaziv()
	{
		return this.naziv;
	}
	public void setNaziv(String naziv)
	{
		this.naziv=naziv;
	}
	
	public void setCenaPoKg(double cenaPoKg)
	{
		this.cenaPoKg=cenaPoKg;
	}
	
	public double getCenaPoKg()
	{
		return this.cenaPoKg;
	}
	
	public double getCenaPoLb()
	{
		return this.cenaPoKg/2.2046;
	}
	public void print()
	{
		System.out.println(this.sifra+ " - "+ this.naziv);
		//System.out.println(this.getCenaPoKg()+ " "+this.getCenaPoLb());
	
	}
}
