package controller;

public class Book
{
	private int ID;
	private String Name;
	private double Price;
	private int Num;
	
	public Book()
	{
		super();
	}

	public Book(int iD, String name, double price, int num)
	{
		super();
		ID = iD;
		Name = name;
		Price = price;
		Num = num;
	}

	public int getID()
	{
		return ID;
	}

	public void setID(int iD)
	{
		ID = iD;
	}

	public String getName()
	{
		return Name;
	}

	public void setName(String name)
	{
		Name = name;
	}

	public double getPrice()
	{
		return Price;
	}

	public void setPrice(double price)
	{
		Price = price;
	}

	public int getNum()
	{
		return Num;
	}

	public void setNum(int num)
	{
		Num = num;
	}
	
}
