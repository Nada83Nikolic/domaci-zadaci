package d_24_01_22_zadatak_1;

public class StaklenaAmbalaza extends Ambalaza{
	private double kaucija;
	private boolean placaSeKaucija;
	private double osnovnaCena;
	public StaklenaAmbalaza() {
	
	}
	public StaklenaAmbalaza(String barCode, String nazivArtikla, double netoTezina, double brutoTezina,double kaucija,double osnovnaCena) {
		super(barCode, nazivArtikla, netoTezina, brutoTezina);
		this.kaucija=kaucija;
		this.osnovnaCena=osnovnaCena;
	}
	public double getKaucija() {
		return kaucija;
	}
	public void setKaucija(double kaucija) {
		this.kaucija = kaucija;
	}
	public boolean isPlacaSeKaucija() {
		return placaSeKaucija;
	}
	public void setPlacaSeKaucija(boolean placaSeKaucija) {
		this.placaSeKaucija = placaSeKaucija;
	}
	
	public double getOsnovnaCena() {
		return osnovnaCena;
	}
	public void setOsnovnaCena(double osnovnaCena) {
		this.osnovnaCena = osnovnaCena;
	}
	@Override
	public double vratiCenu()
	{
		double cena=0;
		if(this.placaSeKaucija)
		{
			cena=this.osnovnaCena*1.2+this.kaucija;
		}else {
			cena=this.osnovnaCena*1.2;
		}
		return cena;
	}
	@Override
	public void stampaj()
	{
		System.out.println(this.barCode+" "+this.nazivArtikla+" "+this.kaucija+"  osnovna cena: "+this.osnovnaCena+" cena sa kaucijom: "+this.vratiCenu());
	}


}
