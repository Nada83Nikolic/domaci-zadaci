package d_18_01_22_zadatak_2;

import java.util.ArrayList;

public class Kombinacija {
	private String idKombinacije;
	private ArrayList <Integer> dobitnaKombinacija=new ArrayList<Integer>();
	
	public Kombinacija(String idKombinacije, ArrayList<Integer> dobitnaKombinacija) {
		
		
		this.idKombinacije = idKombinacije;

	
	}

	public Kombinacija() {
	
	}

	public String getIdKombinacije() {
		return idKombinacije;
	}

	public ArrayList<Integer> getDobitnaKombinacija() {
		return dobitnaKombinacija;
	}
	

	public void print()
	{
		System.out.println(this.idKombinacije+" "+this.dobitnaKombinacija.size());
	}
	
}
