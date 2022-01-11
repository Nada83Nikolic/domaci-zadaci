package d10_01_2022;

public class SmartAirConditioning 
{
String naziv;
int temp;
String mod;


public void stampaj()
{
	System.out.print(this.naziv+" klima ");
	System.out.print(this.mod+ " do ");
	System.out.println(this.temp+ " stepeni.");
}
}
