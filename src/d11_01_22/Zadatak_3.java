package d11_01_22;

import sun.nio.cs.KOI8_R;

public class Zadatak_3 
{

	public static void main(String[] args) 
	{
		FacebookPost korisnik1=new FacebookPost();
		
		korisnik1.imeObjavio="Nada Nikolic ";
		korisnik1.imeKome=" Neko tamo";
		korisnik1.textObjave="Ovo je zabavno :D ";
		korisnik1.brojLajkova=5;
		korisnik1.brojDeljenja=3;
		
		korisnik1.dislike();
		korisnik1.like();
		korisnik1.dislike();
		korisnik1.dislike();
		korisnik1.print();
		
		System.out.println();
		
		FacebookPost korisnik2=new FacebookPost();

		korisnik2.imeObjavio="Nada Nikolic ";
		korisnik2.imeKome=" Drugarima sa kursa";
		korisnik2.textObjave="Super smo odradili test, bravo :D";
		korisnik2.brojLajkova=1;
		korisnik2.brojDeljenja=4;
		
		korisnik2.like();
		korisnik2.share();
		korisnik2.share();
		korisnik2.dislike();
		korisnik2.print();
		
	}

}
