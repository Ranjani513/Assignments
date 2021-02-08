package com.nisum.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class A5 {


public List<String> duplicate(List<String> l) {
	// TODO Auto-generated method stub
	///LinkedHashSet<String> le=null;
	//Set<String> s=new LinkedHashSet(l);
	List<String> li= l.stream().filter(n->n!=null).distinct().collect(Collectors.toList());
	return li;
}
}
