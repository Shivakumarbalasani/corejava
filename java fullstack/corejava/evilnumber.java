class Evilnumber
{
	public static void main(String args[])
	{
		int num=9,rem=0,temp=num,evil=0,start=0;
		int sum=(int)Math.pow(num,2);
		while(sum!=0)
		{
			rem=sum%10;
			evil=evil+rem;//8
			num=num/10;


		}
		System.out.println(evil);
		System.out.println("=====================================================================");
		
		
	

	}
}