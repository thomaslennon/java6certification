package chapter2;

public class Tenor extends Singer{
	public static String sing(){
		return "fa";
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Tenor t = new Tenor();
		Singer s = new Tenor();
		
		System.out.println(t.sing() + " " + s.sing());

	}

}

class Singer{
	public static String sing(){
		return "la";
	}
}
