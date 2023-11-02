class Shiva
{
	public static void main(String args[])
	{
		int num=153,rem=0,arm=0,temp=num,count=0;
		for(;num!=0;num/=10)
		{
			count++;
			
		}
		num=temp;
		for(;num!=0;num/=10)
		{
			rem=num%10;
			arm=arm+(int)Math.pow(rem,3);

		}
		if(arm==temp)
			System.out.println("armstrong");
		System.out.println("===========================================================");

		int palnum=11,paltemp=palnum,palrem=0,palrev=0;
		for(;palnum!=0;palnum/=10)
		{
			palrem=palnum%10;
			palrev=palrev*10+rem;
		}
		palnum=paltemp;
		if(palrev==paltemp)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
		System.out.println("==============================================================");
		
		int primenum=7,primecount=0,primestart=2;
		for(;primestart<primenum;primestart++)
		{
			if(primenum%primestart==0)
			{
				count++;
				break;
			}

		}
		if(primecount==0&&primenum!=1)
				System.out.println("prime");
			else
				System.out.println("not prime");
		System.out.println("==========================================================================");
	

		int primex=1,end=10;
		for(;primex<=end;primex++)
		{
			int primestart1=2,primecount1=0;
			for(;primestart1<primex;primestart1++)
			{
				if(primex%primestart1==0)
				{
					primecount1++;
					break;
				}			
			}
			if(primecount1==0&&primex!=1)
				System.out.println(primex);
			
		}
			System.out.println("===============================================================================");

			


			
			int evilnum=9,square=0,evilrem=0,evil=0;
			square=(int)Math.pow(evilnum,2);
			for(;square!=0;square/=10)
			{
				evilrem=square%10;
				evil=evil+evilrem;
			}
			if(evil==evilnum)

			System.out.println("evilnumber");
		
			System.out.println("======================================================================");
		
		int technum=3025,techcount=0,techtemp=technum,techsum=0,firsthalf=0,sechalf=0;
		for(;technum!=0;technum/=10)
		{
			techcount++;
		}
		
		technum=techtemp;
		if(techcount%2==0)
		{
			firsthalf=technum%(int)Math.pow(10,techcount/2);
			sechalf=technum/(int)Math.pow(10,techcount/2);
		}
		technum=techtemp;
		techsum=firsthalf+sechalf;
		int techsquare=(int)Math.pow(techsum,2);
		if(technum==techsquare)
		{
			System.out.println("Technology number");
		}
		else
		{
			System.out.println("not a technology number");
		}
		System.out.println("==============================================================================");

		int pownum=132,powsum=0,powrem=0,powproduct=1;
		for(;pownum!=0;pownum/=10)
		{
			powrem=pownum%10;//2,3,1
			powsum+=powrem;//2
			powproduct*=powrem;
		}
		if(powsum==powproduct)
			System.out.println("powernumber");

		System.out.println("=================================================================================");


		int aliennum=12,alienrev=0,alienrev2=0,alienrem=0,aliensqr1=0,aliensqr2=0;
		aliensqr1=(int)Math.pow(aliennum,2);
		for(;aliennum!=0;aliennum/=10)
		{
			alienrem=aliennum%10;
			alienrev=alienrev*10+alienrem;
		}
		aliensqr2=(int)Math.pow(alienrev,2);
		alienrem=0;
		for(;aliensqr2!=0;aliensqr2/=10)
		{
			alienrem=aliensqr2%10;
			alienrev2=alienrev2*10+alienrem;
		}
		if(alienrev2==aliensqr1)
			System.out.println("Aliennumber");
		else
			System.out.println("Not an Aliennumber");

		System.out.println("========================================================================================");

		int autonum=76,autotemp=autonum,autocount=0,autosqr=0,lastdigit=0;
		autosqr=(int)Math.pow(autonum,2);
		for(;autonum!=0;autonum/=10)
		{
			autocount++;
		}
		autonum=autotemp;
		lastdigit=autosqr%(int)Math.pow(10,autocount);
		
		if(autonum==lastdigit)
			System.out.println("Automatic");
		else
			System.out.println("not Automatic");
		
		
			


			
			
			
		
		

	}
		
		
}