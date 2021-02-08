package java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Map1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<Integer,String> map=new HashMap<>();
map.put(1, "ranjani");
map.put(2, "ranjani");
map.put(45, "ranjani");
map.put(4, "ranjani");
//Map<Boolean, List<Entry<Integer, String>>> map1=map.entrySet().stream().collect(Collectors.partitioningBy(p->(p.getKey()%2)==0));
//System.out.println(map1);
String m1=map.compute(4, (k,v)->"Nikhila");
map.putIfAbsent(5, "Divya");
map.forEach((k,v)->System.out.println("Key:"+k+"\t"+"Value:"+v));
System.out.println("After computeIfAbsent"+m1);
map.merge(5, "Raga", (k,v)->v==null?"Raga":v.concat("Raga"));

HashMap<Integer,String> m12=map.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(oldvalue,newvalue)->newvalue,HashMap::new));

m12.forEach((k,v)->System.out.println("Keys:"+k+"\t"+"Value:"+v));


List<Integer> li=Arrays.asList(1,2,3,4,9,6);
List<Integer> le=Arrays.asList(12,23,34,45,56);
boolean b=li.stream().anyMatch(n->n%2==0);
System.out.println(b);



Map<Boolean, List<Integer>>l=li.stream().collect(Collectors.partitioningBy(n->n%2==0));
System.out.println(l);

Map<Integer, List<Integer>> m=li.stream().collect(Collectors.groupingBy(n->n%3));
System.out.println("GroupBy:"+m);

List<List<Integer>> list=Arrays.asList(li,le);
long countwithoutflat=list.stream().count();
System.out.println(countwithoutflat);
long countwithflat=list.stream().flatMap(n->n.stream()).count();
System.out.println(countwithflat);



IntSummaryStatistics s=li.stream().collect(Collectors.summarizingInt(n->n));
System.out.println("Getmaximum:"+s.getMax());
System.out.println("Getmaximum:"+s.getMin());
System.out.println("GetAverage:"+s.getAverage());



	}

}
