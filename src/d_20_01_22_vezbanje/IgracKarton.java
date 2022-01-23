package d_20_01_22_vezbanje;

public class IgracKarton {

	public static void main(String[] args) {
		Karton karton=new Karton();
		Karton karton1=new Karton();
		karton.setTipKartona("zuti");
		
		karton1.setTipKartona("crveni");
		Igrac i1=new Igrac("Petar Petrovic","62645962",1985,5,"odbrana");
		i1.setJeKapiten(false);
		i1.dodajKarton(karton);
		i1.dodajKarton(karton);
		i1.dodajKarton(karton1);
		i1.stampaj();

}
}