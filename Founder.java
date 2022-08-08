class Founder
{
	String name ;
	String from;
	Profession profession;
	int since ;
	boolean alive ;
	double income;
	
	Founder(String name, String from, Profession profession, int since, boolean alive, double income)
	{
		this.name = name;
		this.from=from;
		this.profession=profession;
		this.since=since;
		this.alive=alive;
		this.income=income;
	}

	
	void printData()
	{
		System.out.println("The name of the founder is :"+this.name);
		System.out.println("The founder is from :"+this.from);
		System.out.println("The founder is professioned in :"+this.profession);
		System.out.println("It was established in the year :"+this.since);
		System.out.println("The founder is :"+this.alive);
		System.out.println("The income of the owner is :"+this.income);
	}
	
	
}