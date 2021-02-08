package junit.nisum;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.j.JunitEx;

public class Extest {

	@Test
	public void test() {
		Ex j=new Ex();
		int res=j.sum(20, 30);
		assertEquals(50,res);
	}

}
