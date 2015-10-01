package com.training.domains;

public class RangeCheckException extends Exception 
{
   private int number;

   
@Override
public String getMessage() {
	// TODO Auto-generated method stub
	return this.number+":=Should be 1000-5000";
}


public RangeCheckException(int number) 
{
	super();
	this.number = number;
}
   
}
