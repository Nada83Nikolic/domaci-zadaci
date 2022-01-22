package d_20_01_22_zadatak_1;

public class Osoba {

	protected String ImeIPrezime;
	protected String jmbg;
	protected int godinaRodjenja;
	public Osoba() {
	
	}
	public Osoba(String imeIPrezime, String jmbg, int godinaRodjenja) {
		
		ImeIPrezime = imeIPrezime;
		this.jmbg = jmbg;
		this.godinaRodjenja = godinaRodjenja;
	}
	public String getImeIPrezime() {
		return ImeIPrezime;
	}
	public void setImeIPrezime(String imeIPrezime) {
		ImeIPrezime = imeIPrezime;
	}
	public String getJmbg() {
		return jmbg;
	}
	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}
	public int getGodinaRodjenja() {
		return godinaRodjenja;
	}
	public void setGodinaRodjenja(int godinaRodjenja) {
		this.godinaRodjenja = godinaRodjenja;
	}
	public void stampaj()
	{
		System.out.println(this.ImeIPrezime+ ", "+this.jmbg+", "+this.godinaRodjenja+" god");
	}
	

	
	
}
