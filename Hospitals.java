class Hospitals
{
	String name ;
	Specialization specialization;
	String [] equipments;
	double consultationFees;
	Founder founder;
	
	Hospitals(String name, Specialization specialization, String [] equipments, double consultationFees, Founder founder)
	{
		this.name=name;
		this.specialization=specialization;
		this.equipments=equipments;
		this.consultationFees=consultationFees;
		this.founder=founder;
	}
	
	void printData()
	{
		System.out.println("The name of the Hospital is :"+this.name);
		System.out.println("The specialization of the Hospital is :"+this.specialization);
		for (int b=0; b<this.equipments.length; b++)
		{
			System.out.println("The name of the equipment is :"+this.equipments[b]);
		}
		System.out.println("The consultancy fee is :"+this.consultationFees);
		this.founder.printData();
		
	}
	
}