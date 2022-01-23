package d_21_01_22_zadatak_1;

public class ProdavnicaMain {

	public static void main(String[] args) {
	
		Sektor sektor1=new Sektor("Trgovina",15000);
		Sektor sektor2=new Sektor("Racunovodstvo",25000);
		Sektor sektor3=new Sektor("Marketing",35000);
		Sektor sektor4=new Sektor("Finansije",40000);
		Magacioner m1=new Magacioner();
	
		m1.setImeIPrezime("Nada Nikolic");
		m1.dodajSektor(sektor1);
		m1.dodajSektor(sektor2);
		m1.dodajSektor(sektor3);
		m1.print();
		
		System.out.println();
		System.out.println();
		
		Menadzer menadzer=new Menadzer();
		menadzer.setImeIPrezime("Petar Petrovic");
		menadzer.dodajSektor(sektor3);
		menadzer.dodajSektor(sektor1);
		menadzer.dodajSektor(sektor4);
		menadzer.print();
	}

}
