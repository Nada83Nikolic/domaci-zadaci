package d11_01_22;

public class SmartAirConditioning 
{

	String marka;
	int kadGreje;
	int kadHladi;
	int izabranaTemperatura;
	String mod;
	
	public void stampaj()
	{
		System.out.println(this.marka+" - "+this.mod+" - "+ this.izabranaTemperatura);
	}
	
	public int izracunajPotrosnju()
	{
		int potrosnja=0;
		if(this.mod.equals("hladi"))
		{
			potrosnja=30*15*this.kadHladi;
		}
		if(this.mod.equals("greje"))
		{
			potrosnja=30*15*this.kadGreje;
		}
	return potrosnja;
	}
	public int vratiCenuPotrosnje()
	{
		int cena=0;
		cena=(this.izracunajPotrosnju()-350)*9+350*6;
		return cena;
	}
	
}
