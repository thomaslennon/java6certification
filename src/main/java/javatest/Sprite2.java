package javatest;

interface Foo2 {
	int bar();
}


public class Sprite2 {
	
	
	public int foobar(Foo2 foo){
		return foo.bar();
	}
	
	public void testFoobar(){
		foobar(new Foo2(){ public int bar(){return 1;}});
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
