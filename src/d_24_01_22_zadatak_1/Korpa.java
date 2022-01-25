package d_24_01_22_zadatak_1;

import java.util.ArrayList;

public class Korpa {
	
	ArrayList <Ambalaza>ambalaze=new ArrayList<Ambalaza>();
	
	
	
	public Korpa() {
		
	}
	
	
	public ArrayList<Ambalaza> getAmbalaze() {
		return ambalaze;
	}


	public void dodajAmbalazu(Ambalaza ambalaza)
	{
		this.ambalaze.add(ambalaza);
	}
	public void izbaciAmbalazu(String barCode)
	{
		for(int i=0;i<ambalaze.size();i++)
		{
			if(ambalaze.get(i).equals(barCode))
			{
				ambalaze.remove(i);
			}
		}
	}
	private double vratiCenuSaPopustom(double popust)
	{
		double cenaSaPopustom=0;
		for(int i=0;i<ambalaze.size();i++)
		{
			cenaSaPopustom=(cenaSaPopustom+ambalaze.get(i).vratiCenu());
		}
		return cenaSaPopustom-popust;
		
	}
	public double cenaKorpe(SuperKartica kartica)
	{double cenaKorpe=0;
		for(int i=0;i<ambalaze.size();i++)
		{
			cenaKorpe=cenaKorpe+ambalaze.get(i).vratiCenu();
		}
		return cenaKorpe;
		
	}

	public void print()
	{
		System.out.println("Cena sa popustom: "+this.vratiCenuSaPopustom(10));
	}
}
