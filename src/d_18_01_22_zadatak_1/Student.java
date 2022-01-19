package d_18_01_22_zadatak_1;

import java.util.ArrayList;

public class Student {
	private String brIndexa;
	private String imeiPrezimeStudenta;
	private String tipStudija;
	private ArrayList<Ispit>ispiti=new ArrayList<Ispit>();
	
	public Student() {
	}
	public Student(String brIndexa, String imeiPrezimeStudenta, String tipStudija) {
	
		this.brIndexa = brIndexa;
		this.imeiPrezimeStudenta = imeiPrezimeStudenta;
		this.tipStudija = tipStudija;
	}
	public String getBrIndexa() {
		return brIndexa;
	}
	public void setBrIndexa(String brIndexa) {
		this.brIndexa = brIndexa;
	}
	public String getImeiPrezimeStudenta() {
		return imeiPrezimeStudenta;
	}
	public void setImeiPrezimeStudenta(String imeiPrezimeStudenta) {
		this.imeiPrezimeStudenta = imeiPrezimeStudenta;
	}
	public String getTipStudija() {
		return tipStudija;
	}
	public void setTipStudija(String tipStudija) {
		this.tipStudija = tipStudija;
	}
	public ArrayList<Ispit> getIspiti() {
		return ispiti;
	}
	public void dodajIspit(Ispit ispit)
	{		
		this.ispiti.add(ispit);
	}
	
	public double izracunajProsek()
	{
		int brojac=0;
		double prosek=0;
		
		for (int i = 0; i < ispiti.size(); i++) {

			if (ispiti.get(i).jePolozen()) {
				brojac++;
				prosek = prosek + ispiti.get(i).getOcena();
			}
		}
		return prosek/brojac;
	}
	
	public void print()
	{
		System.out.println(this.brIndexa + " - " + this.imeiPrezimeStudenta + " - " + this.tipStudija);
		for(int i=0; i< ispiti.size();i++)
		{
			this.ispiti.get(i).stampajIspit();
		}
		System.out.println("Prosecna ocena polozenih ispita je: "+this.izracunajProsek());
	}
}
