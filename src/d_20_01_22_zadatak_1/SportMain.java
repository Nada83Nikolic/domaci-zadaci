package d_20_01_22_zadatak_1;

public class SportMain {

	public static void main(String[] args) {
		
		Igrac i1=new Igrac("Petar Petrovic", "2405982715425",1982,10,"odbrana",true);
		Igrac i2=new Igrac("Marko Markovicc", "0308988714982",1988,7,"napad",false);
		
		i1.stampaj();
		i2.stampaj();

		Trener t1=new Trener("Sasa Savic", "2502975681726",1975,15,"kondicioni trener");
		Trener t2=new Trener ("Milos Milosevic","1706981721426",1981,7,"pomocni trener");
		t1.stampaj();
		t2.stampaj();
	}

}
