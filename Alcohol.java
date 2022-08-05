class Alcohol
{
	static String precaution = "Alcohol is injurious to health";
	String brand = "Budweiser";
	double alcoholPercent = 8;
	double price = 200;
	boolean mrp = true;
	
	
	Alcohol()
	{
		System.out.println("Always drink the alcohol in limit");
	}
	
	Alcohol(String name)
	{
		brand = name;
	}
	
	
}