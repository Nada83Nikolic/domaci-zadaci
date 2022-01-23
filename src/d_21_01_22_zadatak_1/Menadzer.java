package d_21_01_22_zadatak_1;

import java.util.ArrayList;

public class Menadzer extends Radnik{

	public Menadzer(String imeIPrezime, ArrayList<Sektor> sektori) {
		super(imeIPrezime, sektori);
	}

	public Menadzer() {
		super();
	}

	@Override
	public double vratiPlatu()
	{
		double suma=0;
		for(int i=0;i<sektori.size();i++)
		{
			suma=suma+sektori.get(i).getPlata();
		}
	return suma;
}
	public void print()
	{
		System.out.println(this.imeIPrezime+ " "+this.vratiPlatu());
		for (int i=0;i<sektori.size();i++)
		{
			System.out.print(this.sektori.get(i).getNazivSektora()+", ");
		}
	}
}
