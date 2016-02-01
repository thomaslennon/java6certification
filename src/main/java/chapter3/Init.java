package chapter3;

public class Init {
	
	Init(){
		System.out.println("init 1");
	}
	Init(int i){
		System.out.println("init 2");
	}
	
	{System.out.println("Instance 1");}
	{System.out.println("Instance 2");}
	
	static{
		System.out.println("static 1");
	}
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Init();
		new Init(0);

	}
	
	static{
		System.out.println("static 2");
	}
	

}
