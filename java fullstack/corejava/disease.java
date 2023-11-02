class Disease
{
	public static void main(String args[])
	{
		String disease="typhoid";
		int age=25;
		int sugar=330;
		switch(disease)
		{
			case "diarehea":
					if(age>0&&age<=15)
					System.out.println("take medication at home");
					else if(age>=15&&age<=60)
					System.out.println("admit in general ward");
					else if(age>60)
					System.out.println("need to admit in ICU");
					break;

			case "typhoid":
					if(age>0&&age<=15)
					System.out.println("visit hospitalfor checkups");
					else if(age>=15&&age<=60)
					System.out.println("need to go urine test");
					else if(age>60)
					System.out.println("admit in icu for bone marrow test");
					break;
			case "diabetes":
					if(sugar>300)
					System.out.println("need to have insulin and blood test");
					else
					System.out.println("have pills");
					
					break;
					
		}
	}


}