class Casevowel
{
	public static void main(String args[])
	{
		char letter='6';
		if(letter>='a'&&letter<='z')
		{
			if(letter=='a'||letter=='e'||letter=='i'||letter=='o'||letter=='u')
				System.out.println("small case vowel");
			else 
				System.out.println("small case consonant");

		}
		else if(letter>='A'&&letter<='Z')
		{
			if(letter=='A'||letter=='E'||letter=='I'||letter=='O'||letter=='U')
				System.out.println("capital case vowel");
			else
				System.out.println("capital case consonant");

		}
		else if(letter>='0'&&letter<='9')
				System.out.println("it is a number");
			
		else
				System.out.println("Symbols");
	}


}