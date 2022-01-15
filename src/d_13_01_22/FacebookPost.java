package d_13_01_22;

public class FacebookPost {
	private String imeKo;
	private String imeKome;
	private String text;
	private int brojLajkova;
	private int brojDeljenja;


	public FacebookPost(String imeKo, String imeKome, String text) {
		this.imeKo = imeKo;
		this.imeKome = imeKome;
		this.text = text;
	}

	public String getImeKo() {
		return this.imeKo;
	}

	public String getImeKome() {
		return this.imeKome;
	}

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	
	public void setBrojLajkova(int brojLajkova) {
		this.brojLajkova = brojLajkova;
	}

	public void like() {
		this.brojLajkova = this.brojLajkova +1;
	}
	public void dislike() {
	
		this.brojLajkova=this.brojLajkova-1;
		
		if(this.brojLajkova<0)
		{
			this.brojLajkova=0;}
	}
	public void share() {
		this.brojDeljenja=this.brojDeljenja+1;
	}
	public void print()
	{
		System.out.println(this.imeKo+ " >>> "+ this.imeKome);
		System.out.println(this.text);
		System.out.println("Likes "+this.brojLajkova+ "  |  Shares "+this.brojDeljenja);
	}
}
