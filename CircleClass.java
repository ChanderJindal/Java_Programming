import java.util.Scanner;

class Circle
{
	// Instance Variables
	int centx;
	int centy;
	float r;

	// Methods
	public void setval()
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Center X: ");
		centx=input.nextInt();
		System.out.print("Enter Center Y: ");
		centy=input.nextInt();
		System.out.print("Enter Radius: ");
		r=input.nextFloat();
	}
	public void display()
	{
		System.out.println("Center is ("+centx+", "+centy+")");
		System.out.println("Radius is "+r);
	}
}

public class CircleClass
{
	public static void main(String[] args)
	{
		Circle c=new Circle();
		c.setval();
		c.display();
	}
}