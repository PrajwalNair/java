class StaticInstances	
{
	public static void main (String [] args)
	{
		char [] data = {'N','A','M','A','S','T','E'};
		String string = String.copyValueOf(data);
		System.out.println(string);
		
		String string1 = String.copyValueOf(data,3,2);
		System.out.println(string1);
		
		String string2 = String.valueOf(12);
		System.out.println(string2);
		
		String string3 = String.valueOf(true);
		System.out.println(string3);
		
		String string4 = String.valueOf('M');
		System.out.println(string4);
	
	
	
	}

}