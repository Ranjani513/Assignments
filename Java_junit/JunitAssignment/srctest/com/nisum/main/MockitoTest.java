package com.nisum.main;
import static org.mockito.MockitoAnnotations.initMocks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyList;
import static org.mockito.Mockito.verify;





import static org.junit.jupiter.api.Assertions.*;


@RunWith(MockitoJUnitRunner.class)
class MockitoTest {
@Mock
private AddressOperation addressoperation;
@InjectMocks
private AddressServiceImpl addressimpl;
	
	@Before
	public void setUp() {
		initMocks(this);
	}
	@Test
	void test1() {
		Address a1=new Address("India","malikipuram","1234");
		Address a2=new Address("India","malikipuram","1234");
		Address a3=new Address("India1","malikipuram1","12354");
		Address a4=null;
		List<Address> k=Arrays.asList(a1,a2,a3,a4);
		addressimpl.filterresult(k);
        System.out.println("hello");
		verify(addressoperation).filter(anyList());
		
	/*	ArgumentCaptor<List> empCaptor = ArgumentCaptor.forClass(List.class);
		verify(addressoperation).filter(empCaptor.capture());
		
		List<Address> value = empCaptor.getValue();
		assertEquals(2, value.size());*/
		
	}
}
