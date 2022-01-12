package d11_01_22;

public class FacebookPost
{
	String imeObjavio;
	String imeKome;
	String textObjave;
	int brojLajkova;
	int brojDeljenja;
	
	public void like()
	{
		this.brojLajkova=this.brojLajkova+1;
	}
	public void dislike()
	{
		this.brojLajkova=this.brojLajkova-1;
		if(this.brojLajkova<0)
		{
			this.brojLajkova=0;
		}
	}
	
	public void share()
	{
		this.brojDeljenja=this.brojDeljenja+1;
	}
	
	public void print()
	{
		System.out.println(this.imeObjavio +">>>"+this.imeKome+ "\n"+ this.textObjave+ "\nlikes "+this.brojLajkova+" | shares "+this.brojDeljenja);
	}
}
