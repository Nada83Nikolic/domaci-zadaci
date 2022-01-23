package d_21_01_22_zadatak_1;

import java.util.ArrayList;

public abstract class Radnik {
	protected String imeIPrezime;
	protected ArrayList<Sektor> sektori=new ArrayList<Sektor>();
	
	public Radnik() {
	
	}

	public Radnik(String imeIPrezime, ArrayList<Sektor> sektori) {
		
		this.imeIPrezime = imeIPrezime;
		this.sektori = sektori;
	}

	public String getImeIPrezime() {
		return imeIPrezime;
	}

	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}

	public ArrayList<Sektor> getSektori() {
		return sektori;
	}

public void setSektori(ArrayList<Sektor> sektori) {
		this.sektori = sektori;
	}

public abstract double vratiPlatu();

public void dodajSektor(Sektor sektor)
{
	this.sektori.add(sektor);
}
public void print()
{
	System.out.println(this.imeIPrezime+ " "+this.vratiPlatu());
}
}
