package d_20_01_22_zadatak_1;

public class Igrac extends Osoba{
	
	private int broj;
	private String pozicija;
	private boolean jeKapiten;

	public Igrac() {
		super();
		
	}

	public Igrac(String imeIPrezime, String jmbg, int godinaRodjenja,int broj,String pozicija,boolean jeKapiten) {
		super(imeIPrezime, jmbg, godinaRodjenja);
		this.broj=broj;
		this.pozicija=pozicija;
		this.jeKapiten=jeKapiten;
	}

	public int getBroj() {
		return broj;
	}

	public void setBroj(int broj) {
		this.broj = broj;
	}

	public String getPozicija() {
		return pozicija;
	}

	public void setPozicija(String pozicija) {
		this.pozicija = pozicija;
	}

	public boolean isJeKapiten() {
		return jeKapiten;
	}

	public void setJeKapiten(boolean jeKapiten) {
		this.jeKapiten = jeKapiten;
	}
	@Override
	public void stampaj()
	{
		if(this.jeKapiten)
		{
		System.out.println(this.ImeIPrezime+ ", "+this.jmbg+", "+this.godinaRodjenja+" god"+ ", "+this.broj+", "+this.pozicija+" - "+"Kapiten");
		}else {
			System.out.println(this.ImeIPrezime+ ", "+this.jmbg+", "+this.godinaRodjenja+" god"+ ", "+this.broj+", "+this.pozicija);
		}
		}
	

}
