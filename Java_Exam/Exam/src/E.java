import java.util.*;
import java.util.stream.Collectors;
public class E {
public static void main(String []args) {
	//List<Object> list=Arrays.asList(1,5,6,'A');
	//List<Object> res=list.stream().map(l->l=(int)l).filter(li->((int)li>1 && (int)li<190)).collect(Collectors.toList());
	//res.stream().forEach(System.out::println);
	Scanner sc=new Scanner(System.in);

	System.out.println("enter the length of the array");
	int length1=sc.nextInt();
	String[] arr=new String[length1];
	int arr1[]=new int[50];
	int m=0;
	int numbers[] = new int[length1];
	char alpha[]=new char[length1];
	int k=0;
	int p=0;
	System.out.println("enter the elements");
		for(int j=0;j<length1;j++)
	{
		 arr[j]=sc.next();
		
	}
	 
	for(int i=0;i<length1;i++)
	{
		int temp=arr1[i];
		 temp=Integer.parseInt(arr[i]);
		 char ch1=(char)temp;
		if((ch1>='A' && ch1<='Z'))
		{
			alpha[k]=ch1;
			k++;
		}
		else {
		   
			numbers[p]=arr1[i];
			p++;
		}
	}
	
	Arrays.sort(numbers);
	for(int j=numbers.length-1;j>=0;j--)
	{
		numbers[m]=numbers[j];
		m++;
	}
	for(int l=0;l<numbers.length;l++)
	{
		
		System.out.println(numbers[l]);
	}
	Arrays.sort(alpha);
	for(int l=0;l<alpha.length;l++)
	{
		System.out.println(alpha[l]);
	}
}
}