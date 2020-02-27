class Courrier
{
	//Instance Variables
	int poids;
	boolean isExpress;
	String address;
	boolean isNotValid;
	//Default Constructor
	public Courier()
	{

	}
	//Manual Constructor
	public Courrier(int poids,boolean isExpress,String address)
	{

	}
	//isExpress Method
	public boolean isExpress()
	{
		return isExpress;
	}
	//affainchinCourrier Method
	public double affranchinCourrier()
	{
		return 0;
	}
	//afficher Method
	public void afficher()
	{

	}
}
//Extending Courrier Class 
class Publicite extends Courrier
{
	//instance Variable
	double prix;
	//Manual Constructor of Publicite Class
	public Publicite(int poids, boolean isExpress, String address) {
		super();

	}
	//Method of getPrix
	public double getPrix()
	{
		return 0;
	}
	//Overriding affincher Method
	public void affincher()
	{

	}
	//Overriding affranchirCourier Method
	public double affranchirCourrier()
	{
		return 0;
	}
}
//Lettre Class extending Courrier 
	String format;
	double prix = 0;
	//Non-Default Constructor for Lettre Class
	Lettre(int poids,boolean isExpress,String address,String format)
	{
		super();
	}
	//getter for prix variable
	public double getPrix()
	{
		return prix;
	}
	//Overriden afficher method
	public void afficher()
	{

	}
	//Overriden affranchirCourrier Method
	public double affranchirCourrier()
	{
		return 0;
	}
}
//Colis Class extending Courrier Class
class Colis extends Courrier
{
	//Insatnce Variables
	double volume;
	double prix;

	
	//non-default constructor of Colis Class
	Colis(int poids, boolean isExpress, boolean address, double volume) {
		super();

	}
	//Getter for prix variable
	public double getPrix()
	{
		return 0;
	}
	//Overriden Method affinchir
	public void affinchir()
	{

	}
	//Overriden Method affranchinCourrier
	public double affranchinCourrier()
	{
		return 0;
	}
}