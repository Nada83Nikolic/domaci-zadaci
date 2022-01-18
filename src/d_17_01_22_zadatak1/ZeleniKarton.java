package d_17_01_22_zadatak1;

public class ZeleniKarton {
	private String imeStudenta;
	private String prezimeStudenta;
	private String imeProfesora;
	private String prezimeProfesora;
	private String brojIndexa;
	private String nazivPredmeta;
	private int ocena;
	double prosecnaOcena;
	public ZeleniKarton() {
		
	}

	public ZeleniKarton(String imeStudenta, String prezimeStudenta,String imeProfesora,String prezimeProfesora, String brojIndexa, String nazivPredmeta,
			int ocena) {
		
		this.imeStudenta = imeStudenta;
		this.prezimeStudenta = prezimeStudenta;
		this.imeProfesora=imeProfesora;
		this.prezimeProfesora=prezimeProfesora;
		this.brojIndexa = brojIndexa;
		this.nazivPredmeta = nazivPredmeta;
		this.ocena = ocena;
	}

	public String getNazivPredmeta() {
		return nazivPredmeta;
	}

	public void setNazivPredmeta(String nazivPredmeta) {
		this.nazivPredmeta = nazivPredmeta;
	}

	public int getOcena() {
		return ocena;
	}

	public void setOcena(int ocena) {
		this.ocena = ocena;
	}

	public String getImeStudenta() {
		return imeStudenta;
	}

	public String getPrezimeStudenta() {
		return prezimeStudenta;
	}

	public String getImeProfesora() {
		return imeProfesora;
	}

	public void setImeProfesora(String imeProfesora) {
		this.imeProfesora = imeProfesora;
	}

	public String getPrezimeProfesora() {
		return prezimeProfesora;
	}

	public void setPrezimeProfesora(String prezimeProfesora) {
		this.prezimeProfesora = prezimeProfesora;
	}

	public String getBrojIndexa() {
		return brojIndexa;
	}
	public boolean daLiJePolozio()
	{
		return this.ocena>5;
	}
	
	public void print()
	{
		System.out.println(this.nazivPredmeta+" - "+this.ocena+"\nStudent: "+this.imeStudenta+" "+this.prezimeStudenta);
		System.out.println("Profesor: "+this.imeProfesora+" "+this.prezimeProfesora);
		if(this.daLiJePolozio()==true)
		{
			System.out.println("Ispit je polozen.");
		}
		else
		{
			System.out.println("Ispit nije polozen.");
		}
		System.out.println();
	}
	

}
