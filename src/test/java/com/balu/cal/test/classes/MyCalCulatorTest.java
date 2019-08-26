package com.balu.cal.test.classes;

import org.junit.Assert;
import org.junit.Test;

public class MyCalCulatorTest {
	
	MyCalCulator obj=new MyCalCulator();
	
	@Test
	public void testAddition() {
		int input1=5;int input2=6;
		int output=obj.addition(input1,input2);
		Assert.assertTrue(11 == output);
	}

	@Test
	public void testSubstraction() {
		int input1=5;int input2=8;
		int output=obj.substraction(input1,input2);
		Assert.assertTrue(-3 == output);
	}
	
	@Test
	public void testMultiplication() {
		int input1=9;int input2=50;
		int output=obj.multiplication(input1,input2);
		Assert.assertTrue(450 == output);
	}
}
