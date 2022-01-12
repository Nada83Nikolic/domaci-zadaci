package d11_01_22;

public class Zadatak_2 
{

	public static void main(String[] args)
	{
		SmartAirConditioning tip1=new SmartAirConditioning();
		
		tip1.marka="Samsung";
		tip1.kadHladi=1;
		tip1.kadGreje=2;
		tip1.izabranaTemperatura=25;
		tip1.mod="greje";
		
		tip1.stampaj();
		System.out.println("Mesecna potrosnja je "+tip1.izracunajPotrosnju());
		System.out.println("Cena potrosnje za mesecje " +tip1.vratiCenuPotrosnje()+ " din");
		
		System.out.println();
		
		SmartAirConditioning tip2=new SmartAirConditioning();
		
		tip2.marka="Galanz";
		tip2.kadHladi=1;
		tip2.kadGreje=2;
		tip2.izabranaTemperatura=17;
		tip2.mod="hladi";
		
		tip2.stampaj();
		System.out.println("Mesecna potrosnja je "+tip2.izracunajPotrosnju());
		System.out.println("Cena potrosnje za mesecje " +tip2.vratiCenuPotrosnje()+ " din");
	}
}
