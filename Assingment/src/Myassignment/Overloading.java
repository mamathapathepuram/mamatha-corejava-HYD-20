package Myassignment;

public class Overloading {  
	float add(float x,float y)
	{
		return(y+x);
		}
 static double add(double x,double y)
{
	return(x+y);
}
	public static void main(String[] args) {
		Overloading o1=new Overloading();
		System.out.println(o1.add(4.0,5.5));
		System.out.println(Overloading.add(6.00,9.99));
}
}
