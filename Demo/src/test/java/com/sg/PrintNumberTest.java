package com.sg;

import org.junit.Test;

import com.sg.PrintNumber;
import com.sg.exception.InvalidRangeException;

public class PrintNumberTest {

	@Test
	public void testPrint1(){
		PrintNumber lPrintNumber = new PrintNumber();
		lPrintNumber.print(1, 100);
	}
	
	@Test(expected = InvalidRangeException.class)
	public void testPrint2(){
		PrintNumber lPrintNumber = new PrintNumber();
		lPrintNumber.print(101, 100);
	}
}
