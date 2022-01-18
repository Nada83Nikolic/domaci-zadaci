package d_17_01_22_zadatak_2;

public class Racun {

	private String brojRacuna;
	private String imeIPrezime;
	private int trenutnoStanje;
	
	
	public Racun(String brojRacuna, String imeIPrezime, int trenutnoStanje) {
		
		this.brojRacuna = brojRacuna;
		this.imeIPrezime = imeIPrezime;
		this.trenutnoStanje = trenutnoStanje;
	}
	public String getBrojRacuna() {
		return brojRacuna;
	}
	public void setBrojRacuna(String brojRacuna) {
		this.brojRacuna = brojRacuna;
	}
	public String getImeIPrezime() {
		return imeIPrezime;
	}
	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}
	public int getTrenutnoStanje() {
		return trenutnoStanje;
	}
	public int promeniStanje(int iznos)
	{
		this.trenutnoStanje=this.trenutnoStanje-iznos;
		return this.trenutnoStanje;
	}
	public void print ()
	{
		System.out.println(this.imeIPrezime+ " - " + this.brojRacuna);
		System.out.println("Stanje na racunu je: "+ this.trenutnoStanje);
		System.out.println();
		System.out.println("");
	}
}
