package chapter3;

class Alien{
	String invade(short ships){
		return "a few ";
	}
	String invade(short... ships){
		return "many ";
	}
}

public class Defender {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		short num = 7;
		System.out.println(new Alien().invade(num ));

	}

}
