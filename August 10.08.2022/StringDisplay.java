class StringDisplay
{
	public static void main (String [] args)
	{
		byte [] bytes = {80,82,65,74,87,65,76};
		String st = new String();
		String st1 = new String(bytes);
		System.out.println(st1);
		//String st2 = new String(bytes, "Go");
		//System.out.println(st2);
		String st3 = new String(bytes, 1, 1);
		System.out.println(st3);
		//String st4 = new String(bytes,1, 2, "OH");
		//System.out.println(st4);
		//String st5 = new String(bytes,2,1,"P");
		//System.out.println(st5);
		//String st6 = new String(bytes,"PRAJWAL");
		//System.out.println(st6);
		char [] value = {'P','R','A','J','W','A','L'};
		String st7 = new String(value);
		System.out.println(st7);
		String st8 = new String(value, 2, 3);
		System.out.println(st8);
		int [] codePoints = {12,74,65,74,85};
		String st9 = new String(codePoints,1,3);
		System.out.println(st9);
		String st10 = new String("Windows 10 pro");
		System.out.println(st10);
		StringBuffer str = new StringBuffer("danger");
		String st11 = new String(str);
		System.out.println(st11);
		StringBuilder  str1 = new StringBuilder ("Precaution");
		String st12 = new String(str1);
		System.out.println(st12);













	}
}