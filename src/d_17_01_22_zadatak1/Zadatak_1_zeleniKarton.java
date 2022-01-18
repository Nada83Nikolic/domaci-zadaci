package d_17_01_22_zadatak1;

import java.util.ArrayList;

public class Zadatak_1_zeleniKarton {

	public static void main(String[] args) {

		ArrayList<ZeleniKarton> zk = new ArrayList<ZeleniKarton>();

		ZeleniKarton z1 = new ZeleniKarton("Nada", "Nikolic", "Petar", "Petrovic", "1078/2015", "matematika", 6);
		ZeleniKarton z2 = new ZeleniKarton("Nikola", "Jovic", "Petar", "Petrovic", "1075/2015", "matematika", 5);
		ZeleniKarton z3 = new ZeleniKarton("Marina", "Joksimovic", "Jovan", "Savic", "1034/2001", "Srpski", 9);
		ZeleniKarton z4 = new ZeleniKarton("Marko", "Jokic", "Stevan", "Popovic", "1084/1995", "Srpski", 8);
		ZeleniKarton z5 = new ZeleniKarton("Sanja", "Vasic", "Ilija", "Jovanovic", "1257/1999", "Engleski", 5);
		
		
		zk.add(z1);
		zk.add(z2);
		zk.add(z3);
		zk.add(z4);
		zk.add(z5);
		double prosOcena = 0;
		int brojac = 0;
		for (int i = 0; i < zk.size(); i++) {
			zk.get(i).print();

			if (zk.get(i).daLiJePolozio()) {
				brojac++;
				prosOcena = (prosOcena + zk.get(i).getOcena());
			}
		}
		System.out.println("Prosecna ocena polozenih ispita je: " + prosOcena / brojac);
	}

}
