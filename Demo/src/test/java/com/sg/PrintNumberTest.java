package com.sg;

import org.junit.Test;

import com.sg.PrintNumber;
import com.sg.exception.InvalidRangeException;

public class PrintNumberTest {

	@Test
	public void testPrint1To100(){
		PrintNumber lPrintNumber = new PrintNumber();
		lPrintNumber.print(1, 100);
	}
	
	@Test(expected = InvalidRangeException.class)
	public void testPrint2(){
		PrintNumber lPrintNumber = new PrintNumber();
		lPrintNumber.print(101, 100);
	}
	
	@Test
	public void testPrint51(){
		PrintNumber lPrintNumber = new PrintNumber();
		lPrintNumber.print(51, 51);
	}
	
	@Test
	public void testPrint53(){
		PrintNumber lPrintNumber = new PrintNumber();
		System.out.println("Given number is: " + 53 );
		lPrintNumber.print(53, 53);
	}
	
	@Test
	public void testPrint21(){
		PrintNumber lPrintNumber = new PrintNumber();
		System.out.println("Given number is: " + 21 );
		lPrintNumber.print(21, 21);
	}
	
	@Test
	public void testPrint13(){
		PrintNumber lPrintNumber = new PrintNumber();
		System.out.println("Given number is: " + 13 );
		lPrintNumber.print(13, 13);
	}
	
	@Test
	public void testPrint15(){
		PrintNumber lPrintNumber = new PrintNumber();
		System.out.println("Given number is: " + 15 );
		lPrintNumber.print(15, 15);
	}
	
	@Test
	public void testPrint33(){
		PrintNumber lPrintNumber = new PrintNumber();
		System.out.println("Given number is: " + 33 );
		lPrintNumber.print(33, 33);
	}
}
