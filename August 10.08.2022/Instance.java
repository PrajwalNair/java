class Instance
{
	public static void main(String[] args)
	{
		
		String name="Despacito";
		String up=name.toUpperCase();
		System.out.println(up);
		
		int g=name.codePointCount(1,2);
		System.out.println(g);
		
		String j=name.replace('D','T');
		System.out.println(j);
		
		String t=name.trim();
		System.out.println(t);
		
		boolean c=name.contains("s");
		System.out.println(c);
		
		boolean en=name.endsWith("o");
		System.out.println(en);
		
		String name1="Ronaldo";
		int d=name.compareTo(name1);
		System.out.println(d);
		
		char ch=name.charAt(2);
		System.out.println(ch);
		
		int f=name.codePointAt(2);
		System.out.println(f);
		
		String q=name.substring(1,3);
		System.out.println(q);
		
		String str=" OO";
		String name2=name.concat(str);
		System.out.println(name2);
		
		int len=name.length();
		System.out.println(len);
		
		boolean b=name.matches("De");
		System.out.println(b);
		
		String a=name.intern();
		System.out.println(a);
		
		boolean em=name.isEmpty();
		System.out.println(em);
		
		
		
		
		
	}
}