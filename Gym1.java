class Gym1
{
	String name ;
	double fees ;
	String [] equipments ;
	Trainer trainer ;
	
	
	Gym1(String name, double fees, String [] equipments, Trainer trainer)
	{
		this.name = name;
		this.fees = fees ;
		this.equipments = equipments ;
		this.trainer = trainer;
	}
	
	void printData ()
	{
		System.out.println(this.name );
		System.out.println(this.fees );
		for (int a=0; a<this.equipments.length; a++)
		{
			System.out.println(this.equipments[a] );
		}
		trainer.printData();
		
	}
	
}