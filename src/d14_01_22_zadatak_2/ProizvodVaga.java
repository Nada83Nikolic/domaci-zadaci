package d14_01_22_zadatak_2;

public class ProizvodVaga {

	public static void main(String[] args) {
		
		Proizvod p1=new Proizvod(1235,"Jabuke",100);
		Vaga v1=new Vaga();
		
		v1.setProizvod(p1);
		v1.setMernaJedinica("lb");
		v1.setTezina(2.5);
		
		v1.stampaj();
		
		
		Proizvod p2=new Proizvod(254,"Krompir",85);
		Vaga v2=new Vaga();
		
		v2.setProizvod(p2);
		v2.setMernaJedinica("kg");
		v2.setTezina(1.5);
		
		v2.stampaj();
	}
		
}
