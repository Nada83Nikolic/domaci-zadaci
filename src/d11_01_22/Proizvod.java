package d11_01_22;

public class Proizvod 
{
	String naziv;
	double cena;
	double tezina;
	
	public void stampaj()
	{
		System.out.println( this.naziv+", ");
		System.out.print("Cena: "+this.cena+", ");
		System.out.println(this.tezina+"g");
	}
	
	public void povecajCenu(double povecanje)
	{
		this.cena=this.cena+povecanje;
	}
	
	public double vratiCenuSaPopustom(int popust)
	{
		double	cenaSaPopustom=this.cena-this.cena*popust/100;
			return cenaSaPopustom;
	}
	
	public int vratiPostarinu()
	{
		int postarina=0;
		if(this.tezina<=100)
		{
			postarina=200;
		}
		if( this.tezina>=101 && this.tezina<=500)
		{
			postarina=400;
		}
		if(this.tezina>500)
		{
			postarina=1000;
		}
		return postarina;
	}

}
