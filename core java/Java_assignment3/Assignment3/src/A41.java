//4) create parametrized class in Java using Generics ?
public class A41<T> {
  T t;
  public void set(T t)
  {
	  this.t=t;
  }
  public T get()
  {
	  return t;
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 A41<Integer> a=new A41<>();
 a.set(2);
 System.out.println(a.get());
 
	}

}
