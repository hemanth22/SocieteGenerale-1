package com.sg;

/**
 * 	Updated: clarification of the rules:
	• We watch the dividers before the content (eg 51 -> FooBar)
	• We look at the content in the order that it appears (eg 53 -> BarFoo)
	• We look at the many in order Foo, Bar and Qix (eg 21 -> FooQix)
	• 13 contains, so 3 is written, "Foo"
	• 15 is divisible by 3 and 5 and also contain 5 therefore written "FooBarBar"
	• 33 contains twice 3 is divisible by 3 and thus is written "FooFooFoo"
 *
 */
public class App 
{
	public static void main(String[] args) {
		PrintNumber lPrintNumber = new PrintNumber();
		//lPrintNumber.print(1, 100);
		lPrintNumber.print(51, 51); //FooBar
		lPrintNumber.print(53, 53); //BarFoo
		lPrintNumber.print(21, 21); //FooQix
		lPrintNumber.print(13, 13); //Foo
		lPrintNumber.print(15, 15); //FooBarBar
		lPrintNumber.print(33, 33);   //FooFooFoo
	}
}
