package d_21_01_22_zadatak_1;

import java.util.ArrayList;

public class Magacioner extends Radnik {

	public Magacioner(String imeIPrezime, ArrayList<Sektor> sektori) {
		super(imeIPrezime, sektori);
	}

	public Magacioner() {
		super();
	}

	private void izracunajProsecnuPlatu() {
		double prosecnaPlata = 0;
		for (int i = 0; i < sektori.size(); i++) {
			prosecnaPlata = (prosecnaPlata + this.sektori.get(i).getPlata()) / i * 0.5;
		}
	}

	@Override
	public double vratiPlatu() {
		double plata = 0;
		int i = 0;
		for (i = 0; i < sektori.size(); i++) {
			
			plata = plata + sektori.get(i).getPlata();
		}
		return plata / (i * 0.5);
	}

	@Override
	public void print() {
		System.out.println(this.imeIPrezime + " " + this.vratiPlatu());
		for (int i = 0; i < sektori.size(); i++) {
			System.out.print(this.sektori.get(i).getNazivSektora() + ", ");
		}
	}
}
