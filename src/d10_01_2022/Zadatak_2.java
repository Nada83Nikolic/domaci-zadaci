package d10_01_2022;

public class Zadatak_2 {

	public static void main(String[] args) {
		SmartAirConditioning tip1=new SmartAirConditioning();
		tip1.naziv="Samsung";
		tip1.temp=32;
		tip1.mod="greje";
		
		tip1.stampaj();
		System.out.println();
		
		SmartAirConditioning tip2=new SmartAirConditioning();
		tip2.naziv="Galanz";
		tip2.mod="hladi";
		tip2.temp=18;
		tip2.stampaj();

	}

}
