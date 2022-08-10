class Gym1Display
{
	public static void main (String [] args)
	{
		String [] a = {"Chest press","dumbell"};
		Trainer trainer = new Trainer("Anil poojary", 9880912840l, 2.5);
		Gym1 gym = new Gym1("Sparten", 500, a,trainer);
		
		trainer.setAge (29);
		
		gym.printData ();
		
		
		
	}
}