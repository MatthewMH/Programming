public abstract class Fruit
{
	//Kelas abstrak yang dapat diturunkan untuk setiap buah.

	//Setiap buah pada kasus diatas memiliki atribut weight dan color.
	protected int weight;
	protected String color;
	protected String grade;
	
	//Setiap buah akan memiliki method untuk mengambil nilai 
	//weight dan color.
	abstract public int getWeight();
	abstract public String getColor();
	abstract public void setGrade(String g);
}