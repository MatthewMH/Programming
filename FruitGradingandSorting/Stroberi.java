public class Stroberi extends Fruit
{
	//Kelas Stroberi yang merupakan turunan dari kelas abstrak Fruit.

	//Konstruktor buah stroberi.
	//Memberikan nilai inisial untuk kelas stroberi.
	public Stroberi()
	{
		weight = 0;
		color = "";
		grade = "";
	}
	
	//method untuk memasukkan nilai weight dan color ke stroberi.
	public void setStroberi(int w, String c)
	{
		weight = w;
		color = c;
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
