package d_24_01_22_zadatak_1;

public class AmbalazaMain {

	public static void main(String[] args) {
		
		SuperKartica kartica1=new SuperKartica("1516139461","Nada Nikolic",50);
		kartica1.print();
		
		
		Korpa korpa=new Korpa();
		StaklenaAmbalaza flasa=new StaklenaAmbalaza("1258-651464", "flasa", 150, 180,10,120);
		StaklenaAmbalaza flasa1=new StaklenaAmbalaza("59494-512631", "flasica", 60, 75,10,50);
		StaklenaAmbalaza flasa2=new StaklenaAmbalaza("59494-512631", "flasica2", 60, 75,10,60);
		
		//	korpa.dodajAmbalazu(new StaklenaAmbalaza("1258-651464", "flasa", 150, 180,30,120));
		//korpa.dodajAmbalazu(new Tetrapak("59494-512631", "tetrapak", 60, 75,35));
		//korpa.dodajAmbalazu(new Tetrapak("5419116651+1", "tetpak", 70, 80,45));
		
		Tetrapak t1=new Tetrapak("59494-512631", "tetrapak", 60, 75,35);
				
				
		
		korpa.dodajAmbalazu(flasa);
		korpa.dodajAmbalazu(flasa1);
		korpa.dodajAmbalazu(flasa2);
		korpa.dodajAmbalazu(t1);
		
		
	//	t1.stampaj();
		
		flasa.stampaj();
		flasa1.stampaj();
		flasa2.stampaj();
		
	System.out.println("Ukupna cena korpe: "+korpa.cenaKorpe(kartica1));
	System.out.println();
	korpa.print();
		

	}

}
