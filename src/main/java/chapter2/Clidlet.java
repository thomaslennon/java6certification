package chapter2;


class Clidder{
	private final void flipper(){System.out.println("Clidder");}
}


public class Clidlet {
	
	public void flipper(){System.out.println("Clidlet");}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Clidlet().flipper();

	}

}
