package com.nisum.main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class A2Test {
A2 a=new A2();
	@Test
	void test() {
		UserException ue=assertThrows(UserException .class,()->a.divide(2, 0));
		assertSame("Invalid data",ue.getMessage());
		
	}
	@Test
  void test1()
  {
	  int r=  a.divide(2, 1);
	  assertEquals(2,r);
  }
}