package com.training.domains;

public class Application {

	public static void main(String[] args) throws Exception {
		
		
		try {
			Book bk1 = new Book(1010 , "Head first java" , 450.00);
			
			Book bk2 = new Book(1010,"Head first java",450.00);
			
			Book bk3 = null;
			
			Book bk4=bk1;
			
			String bk5 = new String("String");
			
			System.out.println("Catious: " + bk1.equals(bk3));
			
			System.out.println("Identity: " + bk1.equals(bk4));
			
			System.out.println("Different class: " + bk1.equals(bk5));
			
			System.out.println("Are they same " + bk1.equals(bk2));
			System.out.println(bk1);
			
		} catch (RangeCheckException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			throw new Exception();
										}
		
		finally
		{
			System.out.println("Inside finally block");
		}
		System.out.println("Bye");

	}

}
