package javatest;


interface Foo{
	int bar();
}

class Beta{
	class A implements Foo{
		public int bar(){
			return 1;
		}
	}
	
	public int fubar(Foo foo){
		return foo.bar();
	}
	
	public void testFoo(){
		class A implements Foo{
			public int bar(){
				return 2;
			}
		}
		System.out.println(fubar(new A()));
	}
}


public class Question16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Beta().testFoo();

	}

}
