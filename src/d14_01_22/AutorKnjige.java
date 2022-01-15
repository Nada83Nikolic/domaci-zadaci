package d14_01_22;

public class AutorKnjige {

	public static void main(String[] args) {
		
		Knjiga k1 = new Knjiga ("ISBN: 86-7436-045-9","Kamionci",2002);
		Autor autor1 = new Autor("Teri","Pracet");
		
		k1.setAutor(autor1);	
		k1.stampaj();

		
		Knjiga k2 = new Knjiga("ISBN: 978-86-521-3107-5","Severna svetlost",2018);
		Autor autor2=new Autor("Filip","Pulman");
		
		k2.setAutor(autor2);
		k2.stampaj();
	}

}
