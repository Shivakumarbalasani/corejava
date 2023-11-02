class Calculationswitch
{
	public static void main(String args[])
	{
		int num1=25;
		int num2=50;
		String operator="Mod";
		switch(operator)
		{
		case "Add":
			System.out.println(num1+num2);
			break;
		case "Sub":
			System.out.println(num1-num2);
			break;
		case "Mul":
			System.out.println(num1*num2);
			break;
		case "Div":
			System.out.println(num1/num2);
			break;
		case "Mod":
			System.out.println(num1%num2);
			break;
		default:
			System.out.println("Enter valid operation good bye");

		}		

	}


}