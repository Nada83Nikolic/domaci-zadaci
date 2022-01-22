package d_20_01_22_zadatak_1;

public class Trener extends Osoba {

	private int godineIskustva;
	private String tipTrenera;
	
	
	
	public Trener() {
		super();
	}
	public Trener(String imeIPrezime, String jmbg, int godinaRodjenja,int godineIskustva,String tipTrenera) {
		super(imeIPrezime, jmbg, godinaRodjenja);
		this.godineIskustva=godineIskustva;
		this.tipTrenera=tipTrenera;
	}



	@Override
	public void stampaj()
	{
		System.out.println(this.ImeIPrezime+ ", "+this.jmbg+", "+this.godinaRodjenja+". god"+ ", "+this.godineIskustva+" godina iskustva, "+this.tipTrenera);
	}
}
