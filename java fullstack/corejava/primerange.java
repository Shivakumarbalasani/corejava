import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value");
		User1 obj=new User1();
		obj.primerange1();
		System.out.println("=================================================");
		obj.primerange2(obj.num1);
		System.out.println("===================================================================");
		obj.num2=sc.nextInt();
		
		for(int x=1;x<=obj.num2;x++)
		{
			int var=obj.primerange3(0,1,x);
			if(var==2)
			System.out.println(x);
		}
		

	}
}
class User1
{
	void primerange1()
	{
		for(int x=1;x<=20;x++)
		{
			int start=2;
			int count=0;
			for(;start<x;start++)
			{
				if(x%start==0)
				{
					count++;
					break;
				}
			}
			if(count==0&&x!=1)
				System.out.println(x);
			
		}
	}
	int num1=20;

	void primerange2(int num1)
	{
		

		for(int x=1;x<=num1;x++)
		{
			int start=2;
			int count=0;
			for(;start<x;start++)
			{
				if(x%start==0)
				{
					count++;
					break;
				}
			}
		if(count==0&&x!=1)
			System.out.println(x);
		}
	}
	int num2,
	int primerange3(int count,int val,int start)
	{
		
			for(start=1;start<value;start++)
			{
				if(value%start==0)
				{
					count++;
					break;
				}
			return count;	
			}
		}
		
		
	}
	

}