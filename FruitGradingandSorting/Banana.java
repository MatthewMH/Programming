public class Banana extends Fruit
{
	//Banana memiliki atribut khusus yaitu speck.
	private String speck; 
	
	//Konstruktor kelas Banana.
	//Memberikan nilai inisial untuk kelas Banana.
	public Banana()
	{
		weight = 0;
		color = "";
		speck = "";
	}
	
	//method untuk memasukkan nilai weight, color dan speck ke stroberi.
	public void setBanana(int w, String c, String s)
	{
		weight = w;
		color = c;
		speck = s;
	}
	
	//method untuk mendapatkan nilai weight.
	public int getWeight()
	{
		return weight;
	}
	
	//method untuk mendapatkan nilai color
	public String getColor()
	{
		return color;
	}
	
	//method untuk mendapatkan nilai speck
	public String getSpeck()
	{
		return speck;
	}

	//method untuk mengatur nilai grade
	public void setGrade(String g)
	{
		grade = g;
	}
	
	//method untuk mendapatkan nilai grade
	public String getGrade()
	{
		return grade;
	}

}
