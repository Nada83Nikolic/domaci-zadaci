package d_24_01_22_zadatak_1;

public abstract class Ambalaza {
	
	protected String barCode;
	protected String nazivArtikla;
	protected double netoTezina;
	protected double brutoTezina;
	
	public Ambalaza() {
		
	}
	public Ambalaza(String barCode, String nazivArtikla, double netoTezina, double brutoTezina) {
		this.barCode = barCode;
		this.nazivArtikla = nazivArtikla;
		this.netoTezina = netoTezina;
		this.brutoTezina = brutoTezina;
	}
	public String getBarCode() {
		return barCode;
	}
	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}
	public String getNazivArtikla() {
		return nazivArtikla;
	}
	public void setNazivArtikla(String nazivArtikla) {
		this.nazivArtikla = nazivArtikla;
	}
	public double getNetoTezina() {
		return netoTezina;
	}
	public void setNetoTezina(double netoTezina) {
		this.netoTezina = netoTezina;
	}
	public double getBrutoTezina() {
		return brutoTezina;
	}
	public void setBrutoTezina(double brutoTezina) {
		this.brutoTezina = brutoTezina;
	}
	public double tezinaPakovanja()
	{
		return this.brutoTezina-this.netoTezina;
	}
	
	public abstract double vratiCenu();
	
	public abstract void stampaj();

}
