package com.addnumber.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.addnumber.AddNumber;

public class AddNumberTest {
	
	AddNumber add=null;
	@Before
	public void create() {
		add= new AddNumber();
	}

	@Test
	public void testBaisc() {
		int output=add.addNumber("1,2");
		assertEquals(3, output);
	}
	
	@Test
	public void testEmpty() {
		int output=add.addNumber("");
		assertEquals(0, output);
	}

	@Test
	public void testWithNextLine() {
		int output=add.addNumber("1\n2,3,4\n");
		assertEquals(10, output);
		
	}
	
	@Test
	public void testWithTab() {
		int output=add.addNumber("1,2\t,3");
		assertEquals(6, output);
		
	}
	
	@Test
	public void testDelimiter() {
//		int output=add.addNumber("//;\n1;2");
		int output=add.addNumber("//1\n2;\n1;2");
//		assertEquals(3, output);
		assertEquals(6, output);
	}
	
	@Test
	public void testNegativeNumber() {
		
//		Exception exception =assertThrows(IllegalArgumentException.class, () -> {
//			add.addNumber("-1,2");
//	    });
		Exception exception =assertThrows(IllegalArgumentException.class, () -> {
			add.addNumber("-1,-2");
	    });
		assertEquals("negative numbers not allowed -1,-2,",exception.getMessage());
	}
	
	
}

