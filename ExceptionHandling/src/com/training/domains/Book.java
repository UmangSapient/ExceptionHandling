package com.training.domains;

public class Book 
{

	private int bookNumber;
	private String bookName;
	private double price;
	
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// Constructor can have a throws clause, throws used with the method signature
	//throw used inside the method
	
	public Book(int bookNumber, String bookName, double price) throws RangeCheckException
	{
		super();
		if(bookNumber<1000 || bookNumber>5000)
		{
			throw new RangeCheckException(bookNumber);
		}
		else
		{
			this.bookNumber = bookNumber;
		}
		
		this.bookName = bookName;
		this.price = price;
	}
	
	public int getBookNumber() {
		return bookNumber;
	}
	
	public void setBookNumber(int bookNumber) {
		
		if(bookNumber<1000 || bookNumber>5000)
		{
			try {
				
			throw new RangeCheckException(bookNumber);
		}catch(RangeCheckException e)
		{
			System.out.println(e.getMessage());
		}
			}
		else
		{
			
		this.bookNumber = bookNumber;
     	}
	}
	
	public String getBookName() {
		return bookName;
	}
	
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	
	public String toString() {
		return "Book [bookNumber=" + bookNumber + ", bookName=" + bookName
				+ ", price=" + price + "]";
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(this == obj)
		{
			return true;
			
		}
		if(obj==null)
		{
			return false;
		
		}
		if(this.getClass()!=obj.getClass())
		{
			return false;
		}
		
		Book bk= (Book)obj;
		
		return this.bookNumber==bk.bookNumber && this.bookName.equals(bk.bookName);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.bookNumber +7 * this.bookNumber;
	}
	
	
}
