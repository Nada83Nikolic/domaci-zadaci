package d_17_01_22_zadatak_2;

public class Transakcija {
	private String idTransakcije;
	private Racun racunSaKog;
	private Racun racunNaKoji;

	
	public Transakcija() {
	
	}
	public Transakcija(String idTransakcije, Racun racunSaKog, Racun racunNaKoji) {
		
		this.idTransakcije = idTransakcije;
		this.racunSaKog = racunSaKog;
		this.racunNaKoji = racunNaKoji;
	}
	public String getIdTransakcije() {
		return idTransakcije;
	}
	public void setIdTransakcije(String idTransakcije) {
		this.idTransakcije = idTransakcije;
	}
	public Racun getRacunSaKog() {
		return racunSaKog;
	}
	public void setRacunSaKog(Racun racunSaKog) {
		this.racunSaKog = racunSaKog;
	}
	public Racun getRacunNaKoji() {
		return racunNaKoji;
	}
	public void setRacunNaKoji(Racun racunNaKoji) {
		this.racunNaKoji = racunNaKoji;
	}
	private int vratiProviziju(int iznos)
	{
		int provizija=0;
		if(iznos<4500)
		{
			 provizija=45;
		}
		if(iznos>4500)
		{
			provizija=iznos/100;
		}
		return provizija;
	}
	public void izvrsiTransakciju(int vrednost)
	{
		if (this.racunSaKog.getTrenutnoStanje()-vrednost-this.vratiProviziju(vrednost)>0)
		{
			
			System.out.println("Racuna sa: "+this.racunSaKog.getImeIPrezime()+" " +this.racunSaKog.getBrojRacuna());
			System.out.println(this.racunSaKog.promeniStanje(vrednost)-this.vratiProviziju(vrednost));
	
			System.out.println("Racun na: "+this.racunNaKoji.getImeIPrezime()+" " +this.racunNaKoji.getBrojRacuna());
			System.out.println(this.racunNaKoji.promeniStanje(-vrednost));
		}
		else
		{
			System.out.println("Nemate dovoljno sredstava da izvrsite zeljenu transakciju.");
		}
		
	}
	

}
