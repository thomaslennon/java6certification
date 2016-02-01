package chapter3;

public class BoxOrVararg {
	
	void go(Byte b, Byte b1){
		System.out.println("byte, byte");
	}
	void go(byte... bytes){
		System.out.println("byte...");
	}
	
	void go(byte myByte){
		System.out.println("byte");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		byte b = 5;
		new BoxOrVararg().go(b,b);
		new BoxOrVararg().go(b);
		new BoxOrVararg().go(b,b, b);

	}

}
