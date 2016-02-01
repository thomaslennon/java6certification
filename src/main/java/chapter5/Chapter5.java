package chapter5;

public class Chapter5 {
	
	
	public Chapter5(){
		
		int age = 0;
//		outer:
		while(age<21){
			age++;
			if(age>=16){
				System.out.println("get your drivers License! " + age);
				continue;
			}
			System.out.println("Wait another year! " + age);
		}
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		new Chapter5();
		

	}

}
