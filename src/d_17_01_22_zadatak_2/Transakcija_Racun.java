package d_17_01_22_zadatak_2;

public class Transakcija_Racun {

	public static void main(String[] args) {
	Racun r1=new Racun("51544-5154","Nada Nikolic",150000);
	Racun r2=new Racun("152-246-326","Pera Peric",15000);
	Transakcija t1=new Transakcija();
	t1.setRacunSaKog(r1);
	t1.setRacunNaKoji(r2);
	
//	r1.promeniStanje(150);
	
	r1.print();
	r2.print();
	
	
	t1.izvrsiTransakciju(149000);
	
	
	}

}
