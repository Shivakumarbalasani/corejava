class Leapyearfeb
{
	public static void main(String args[])
	{
		int year=2012;
		int month=2;
		if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
			System.out.println("31 days");
		else if(month==4||month==6||month==9||month==11)
			System.out.println("30 days");
		else if(month==2)
			if((year%4==0&&year%100!=0)||(year%400==0))
				System.out.println("is a leap year 29days in february");
			else
				System.out.println("is not a leap year 28days in february");
		

	}


}