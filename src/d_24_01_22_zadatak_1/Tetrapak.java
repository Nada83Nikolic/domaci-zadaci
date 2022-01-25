package d_24_01_22_zadatak_1;

public class Tetrapak extends Ambalaza {
	
	private boolean recikliraSe;
	private double osnovnaCena;
	
	public Tetrapak() {
		super();
		
	}
	public Tetrapak(String barCode, String nazivArtikla, double netoTezina, double brutoTezina,double osnovnaCena) {
		super(barCode, nazivArtikla, netoTezina, brutoTezina);
		this.osnovnaCena=osnovnaCena;
	}
	public boolean isRecikliraSe() {
		return recikliraSe;
	}
	public void setRecikliraSe(boolean recikliraSe) {
		this.recikliraSe = recikliraSe;
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
		if(this.recikliraSe)
		{
			cena=this.tezinaPakovanja()*1.5+this.osnovnaCena;
		}else {
			cena=this.osnovnaCena;
		}
		return cena;
	}
	@Override
	public void stampaj()
	{
		System.out.println(this.barCode+" "+this.nazivArtikla+" osnovna cena:"+this.osnovnaCena+" "+this.vratiCenu());
		System.out.println("Tezina: "+this.tezinaPakovanja());
	}

}
