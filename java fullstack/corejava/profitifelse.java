class Profit
{
	public static void main(String args[])
	{
		double price=5000;
		double sold=6111;
		double profit=sold-price;
		if(price<sold)
			System.out.println("profit"+" "+profit);
		else if(price>sold)
			System.out.println("loss"+profit);
		else
			System.out.println("neither loss nor profit");

	}


}
