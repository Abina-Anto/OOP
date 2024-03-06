class Product
{
	int pcode;
	String pname;
	double price;
	public static void main(String args[])
	{
		Product p1=new Product();
		Product p2=new Product();
		Product p3=new Product();
		p1.price=2000;
		p2.price=3000;
		p3.price=8000;
		if(p1.price<p2.price && p1.price<p3.price)
		{
		System.out.println("Price 1 is lowest "+p1.price);
		}
		else if(p2.price>p1.price && p2.price>p3.price)
		{
		System.out.println("Price 2 is lowest "+p2.price);
		}
		else
		{
		System.out.println("price 3 is lowest "+p3.price);
		}
	}
}
