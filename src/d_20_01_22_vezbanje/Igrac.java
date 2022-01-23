package d_20_01_22_vezbanje;

import java.util.ArrayList;

public class Igrac extends Osoba{
	ArrayList<Karton>kartoni=new ArrayList<Karton>();
	private int broj;
	private String pozicija;
	
	
	boolean jeKapiten;

	public Igrac(String imeIPrezime, String jmbg, int godinaRodjenja,int broj,String pozicija) {
		super(imeIPrezime, jmbg, godinaRodjenja);
		this.broj=broj;
		this.pozicija=pozicija;
		
	}

	public Igrac(ArrayList<Karton> kartoni, int broj, String pozicija, boolean jeKapiten) {
		super();
		this.kartoni = kartoni;
		this.broj = broj;
		this.pozicija = pozicija;
		this.jeKapiten = jeKapiten;
	}

	public Igrac() {
		super();
		
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
	public void dodajKarton(Karton karton)
	{
		this.kartoni.add(karton);
	}
	public int vratiZuti()
	{
		int brojKartona=0;
		for(int i=0;i<kartoni.size();i++)
		{
		if(this.kartoni.get(i).getTipKartona().equals("zuti"))
			brojKartona=brojKartona+1;
		}
		return brojKartona;
	}
	public int vratiCrveni()
	{
		int brojKartona=0;
		for(int i=0;i<kartoni.size();i++)
		{
		if(this.kartoni.get(i).getTipKartona().equals("crveni"))
			brojKartona=brojKartona+1;
		}
		return brojKartona;
	}
	@Override
	public void stampaj()
	{
		System.out.println(this.getImeIPrezime()+" jmbg: "+this.getJmbg()+this.getGodinaRodjenja());
		System.out.println(this.broj+", "+this.pozicija+", crvenih kartona: "+this.vratiCrveni()+" zutih: "+this.vratiZuti());
	if (this.jeKapiten)
	{
		System.out.println("Kapiten");
	}
	}


	

}
