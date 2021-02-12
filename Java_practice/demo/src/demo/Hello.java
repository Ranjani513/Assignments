package demo;


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;

public class Hello {

	  
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Student s=new Student("ranjani",21);
		FileOutputStream f=new FileOutputStream("C:\\\\Users\\\\Dell\\\\Desktop\\\\‪‪out.txt");
   /*   ObjectOutputStream out=new ObjectOutputStream(f);
      out.writeObject(s);
      out.flush();*/
		ByteArrayOutputStream b=new ByteArrayOutputStream();
		for(int i=10;i<15;i++) {
		b.write(i);
		b.writeTo(f);
		}
      System.out.println("completed");
     
    /*  ObjectInputStream i=new ObjectInputStream(new FileInputStream("C:\\\\Users\\\\Dell\\\\Desktop\\\\‪‪out.txt"));
      Student st=(Student)i.readObject();*/
      
 //System.out.println(st.name+"\t"+st.id);
      byte bif[]=b.toByteArray();
      ByteArrayInputStream bi=new ByteArrayInputStream(bif);
      int v=0;
      while((v=bi.read())!=-1)
      {  
    	  System.out.println(v);
      }
	}

}
class Student implements Serializable
{
	String name;
	int id;
	Student(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
}