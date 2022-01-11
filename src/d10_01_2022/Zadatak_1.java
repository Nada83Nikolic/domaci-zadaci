package d10_01_2022;

public class Zadatak_1 
{

	public static void main(String[] args) 
	{
		Proizvod p1=new Proizvod();
		p1.naziv="Kafa";
		p1.cena=299.99;
		p1.tezina=200;
		p1.stampaj();
		System.out.println();
		Proizvod p2=new Proizvod();
		p2.naziv="Secer";
		p2.cena=89.99;
		p2.tezina=1000;
		p2.stampaj();

	}

}
