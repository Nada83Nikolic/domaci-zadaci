package d14_01_22_zadatak_2;

public class Vaga {
	private String mernaJedinica;
	private Proizvod proizvod;
	private double tezina;
	public Vaga() {
		
	}
	public double getTezina()
	{
		return this.tezina;
	}
	public void setTezina(double tezina)
	{
		this.tezina=tezina;
	}
	
	public String getMernaJedinica()
	{
		return this.mernaJedinica;
	}
	public void setMernaJedinica(String mernaJedinica)
	{
		this.mernaJedinica=mernaJedinica;
	}
	public Proizvod getProizvod()
	{
		return this.proizvod;
	}
	public void setProizvod(Proizvod proizvod)
	{
		this.proizvod=proizvod;
	}
	
	public double sracunajCenu(double tezina)
	{
		double cena=0;
		if (this.mernaJedinica.equals("kg"))
		{
			cena=tezina*this.proizvod.getCenaPoKg();
		}
		else if(this.mernaJedinica.equals("lb"))
		{
			cena=tezina*this.proizvod.getCenaPoLb();
		}
		return cena;	
	}
	public void stampaj() {
	
		this.proizvod.print();
		if (this.getMernaJedinica().equals("kg"))
		{
			System.out.println("Cena po kg: "+this.proizvod.getCenaPoKg() +" x " + this.tezina+" kg");
		}
		else
		{
			System.out.println("Cena po lb: "+this.proizvod.getCenaPoLb() +" x " + this.tezina+ "lb");
		}
		
		System.out.println("Ukupna cena: " + this.sracunajCenu(this.tezina));
		
		System.out.println();
	}
}
