class Medication
{
	public static void main(String args[])
	{
		int age=40;
		String disease="typhoid";
		String disease1="cold";
		String disease2="corona";
		if(age>=80||disease=="corona")
		{
			if(disease=="typhoid")
			System.out.println("need to admit in hospital");
			else if(disease=="corona")
			System.out.println("need quarintine");
			else(disease=="cold")
			System.out.println("need medicines");

		}
		else(age>=25)
			System.out.println("syrup");
		

	}


}