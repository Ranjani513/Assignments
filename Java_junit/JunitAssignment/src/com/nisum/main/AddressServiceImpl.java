package com.nisum.main;

import java.util.List;
import java.util.stream.Collectors;

public class AddressServiceImpl implements AddressService {

	private AddressOperation addressoperation;
	public void filterresult(List<Address> h)
	{
		List<Address> r=h.stream().distinct().collect(Collectors.toList());
		
		addressoperation.filter(r);
	}

}
