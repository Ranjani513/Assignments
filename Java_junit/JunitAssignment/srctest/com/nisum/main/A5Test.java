package com.nisum.main;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.Test;

class A5Test {
A5 a=new A5();
	@Test
	void test() {
	List<String>	l=Arrays.asList("ranjani","ranjani",null,"chandu","bhavani");
	List<String>	le=	a.duplicate(l);
		List<String>	li=Arrays.asList("ranjani","chandu","bhavani");
		assertEquals(li,le);
	}

}
