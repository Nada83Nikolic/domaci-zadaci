package d10_01_2022;

public class Proizvod
{
	String naziv;
	double cena;
	double tezina;
	
	public void stampaj()
	{
		System.out.print("{{" +this.naziv+"}}, ");
		System.out.println("{{"+this.cena+"}}, ");
		System.out.println("{{"+this.tezina+"g}}");
	}
}
