import java.util.Scanner;
class Main

{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value");
		User obj=new User();
		obj.num1=sc.nextInt();
		obj.primemethod1();
		System.out.println("================================");
		obj.num2=sc.nextInt();
		obj.primemethod2(obj.num2);
		System.out.println("================================");
		obj.num3=sc.nextInt();
		System.out.println(obj.primecheck(obj.num3));
		System.out.println("=============================================================");
		System.out.println("Reversing Number");
		obj.num4=sc.nextInt();
		obj.reversenumber1();
		System.out.println("====================================================");
		obj.num5=sc.nextInt();
		obj.reversenumber2(obj.num5);
		System.out.println("00000000000000000======================");
		obj.num6=sc.nextInt();
		System.out.println(obj.reversecheck(obj.num6));
		
		
		
	}
}
class User
{
	int num1,count1=0;
	void primemethod1()
	{
		for(int start1=2;start1<num1;start1++)
		{
			if(num1%start1==0)
			{
				count1++;
				break;
			}
		}
		if(count1==0&&num1!=1)
			System.out.println("prime");
		else
			System.out.println("not prime");
	}
		

	
	int num2,count2;

	void primemethod2(int num2)
	{
		for(int start2=2;start2<num2;start2++)
		{
			if(num2%start2==0)
			{
				count2++;
				break;
			}

		}
		if(count2==0&&num2!=1)
			System.out.println("prime");
		else
			System.out.println("not prime");
	}

	int num3,count3=0;
	int primemethod3(int num3)
	{
		for(int start3=2;start3<num3;start3++)
		{
			if(num3%start3==0)
			{
				count3++;
				break;
			}
		}
		return count3;
	}

	String primecheck(int num3)
	{
		int result=primemethod3(num3);
		if(result==0&&num3!=1)
		
			return "prime";
		
		else
		
			return "not prime";
		
	}

	int num4,rem1=0,rev1=0,sum1=0;
	void reversenumber1()
	{
		for(;num4!=0;num4/=10)
		{
			rem1=num4%10;
			rev1=rev1*10+rem1;
			
		}
		sum1=rev1;
		System.out.println(sum1);
		
	}

	int num5,rem2=0,rev2=0,sum2=0;
	void reversenumber2(int num5)
	{
		for(;num5!=0;num5/=10)
		{
			rem2=num5%10;
			rev2=rev2*10+rem2;
		}
		sum2=rev2;
		System.out.println(sum2);

	}
	int num6,rem3=0,rev3=0,sum3=0;
	int reversenumber3(int num6)
	{
		for(;num6!=0;num6/=10)
		{
			rem3=num6%10;
			rev3=rev3*10+rem3;
		}
		return rev3;
	}
	int reversecheck(int num6)
	{
		int sum3=reversenumber3(num6);
		return sum3;
	}
	

	
}