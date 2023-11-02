class Nestedif
{
	public static void main(String args[])
	{
		int age=150;
		if(age>=18)
		{
			if(age>50)
			{
				if(age>=120)
					System.out.println("super senior citizen");
				else
					System.out.println("senior citizen");
			}
		
			else
			{
					System.out.println("Major");
			}
		}
		else
		{
			if(age<10)
				System.out.println("Kids");
			else
				System.out.println("Minor");
		}


	}


}