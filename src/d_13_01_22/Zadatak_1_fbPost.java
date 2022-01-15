package d_13_01_22;


public class Zadatak_1_fbPost {

	public static void main(String[] args) {
		
		
		FacebookPost k1= new FacebookPost("Nada Nikolic","Drustvo sa kursa","Najjaci smo :D");
		k1.like();
		k1.like();
		k1.like();
		k1.like();
		k1.like();
		k1.like();
		k1.dislike();
		k1.dislike();
		k1.share();
		k1.dislike();
		k1.print();
	
	System.out.println();
		FacebookPost k2= new FacebookPost("Nada Nikolic","Neko tamo", "Keep smiling :D");
	
		k2.like();
		k2.like();
		k2.like();
		k2.like();
		k2.like();
		k2.like();
		k2.share();
		k2.share();
		k2.dislike();
		k2.print();
	
		
	}

}
