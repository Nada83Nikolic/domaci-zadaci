package d11_01_22;

public class Zadatak_1 
{

	public static void main(String[] args)
	{
		
		Proizvod p1=new Proizvod();
		p1.naziv="Kafa";
		p1.cena=299.99;
		p1.tezina=200;
		
		p1.povecajCenu(3.45);
		p1.stampaj();
		System.out.println("cena sa popustom je "+p1.vratiCenuSaPopustom(10));	
		System.out.println("Postarina za ovaj proizvod je "+ p1.vratiPostarinu()+" din.");
		
		System.out.println();
		
		Proizvod p2=new Proizvod();
		p2.naziv="knjiga";
		p2.cena=789.5;
		p2.tezina=800;
		
		p2.povecajCenu(30.5);
		p2.stampaj();
		System.out.println("cena sa popustom je "+p2.vratiCenuSaPopustom(20));	
		System.out.println("Postarina za ovaj proizvod je "+ p2.vratiPostarinu()+" din.");
		
		
	}
	
	
}
