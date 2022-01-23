package d_21_01_22_zadatak_1;

public class Sektor {
	private String nazivSektora;
	private int plata;

	public Sektor(String nazivSektora, int plata) {

		this.nazivSektora = nazivSektora;
		this.plata = plata;
	}

	public Sektor() {

	}

	public String getNazivSektora() {
		return nazivSektora;
	}

	public void setNazivSektora(String nazivSektora) {
		this.nazivSektora = nazivSektora;
	}

	public int getPlata() {
		return plata;
	}

	public void setPlata(int plata) {
		this.plata = plata;
	}

}
