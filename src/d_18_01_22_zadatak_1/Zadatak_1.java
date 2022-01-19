package d_18_01_22_zadatak_1;

public class Zadatak_1 {

	public static void main(String[] args) {
		Student s1 = new Student ("1953/20","Luka Nikolic" ," master");
		Ispit i1 = new Ispit ("Matematika", 6,"Marko Petrovic");
		Ispit i2 = new Ispit ("Srpski", 9, " Nikola Nikolic");
		Ispit i3 = new Ispit ("Fizika", 5, " Milos Petrovic");
		Ispit i4 = new Ispit ("Hemija", 7, " Jovan Savic");
		
		s1.dodajIspit(i1);
		s1.dodajIspit(i2);
		s1.dodajIspit(i3);
		s1.dodajIspit(i4);
	//	i1.stampajIspit();
	//	i2.stampajIspit();
	//	i3.stampajIspit();
		
		System.out.println();
		s1.print();
	//	System.out.println("Prosecna ocena polozenih ispita je: " + s1.izracunajProsek());
		System.out.println();
		
		Student s2 = new Student ("1975/19","Jovana Jovanovic", " Osnovne");
		Ispit isp1 = new Ispit ("Geografija", 8,"Nenad Jokic");
		Ispit isp2= new Ispit ("Istorija", 7, "Stefan Radovic");
		Ispit isp3 = new Ispit ("Srpski", 9, " Jovan Janic");
		Ispit isp4 = new Ispit ("Matematika", 5, " Jelena Markovic");
		s2.dodajIspit(isp1);
		s2.dodajIspit(isp2);
		s2.dodajIspit(isp3);
		s2.dodajIspit(isp4);
		s2.print();
		//System.out.println("Prosecna ocena polozenih ispita je: " + s2.izracunajProsek());
	}

}
