package com.addnumber.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.addnumber.AddNumber;

public class AddNumberTest {

	@Test
	public void testBaisc() {
		AddNumber add= new AddNumber();
		int output=add.addNumber("1,2");
		assertEquals(3, output);
	}
	
	@Test
	public void testEmpty() {
		AddNumber add= new AddNumber();
		int output=add.addNumber("");
		assertEquals(0, output);
	}

}
