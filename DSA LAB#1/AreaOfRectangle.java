import java.util.*;
class AreaOfRectangle
{	
    //Instance Variable
        float area;
    //Class Variable
	Scanner sc=new Scanner(System.in);
	//Manual Constructor of Class
	public Area(float length,float breadth)
	{
		area=length*breadth;
	}
    //Method that is returning area
	public float returnArea()
	{
		return area;
	}
    //Main Method
	
	public static void main(String[] args)
	{
	//Local variables
		float length;
		float breadth;
	//Taking input from user
		System.out.println("Enter the Length:");
		length=sc.nextFloat();
		System.out.println("Enter  the Breadth:");
		breadth=sc.nextFloat();
	//Object creating
		Area area=new Area(length,breadth);
		System.out.println("Area of Rectangle is "+area.returnArea());
	}

}