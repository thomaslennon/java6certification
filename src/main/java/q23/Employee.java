package q23;

interface Data {
	public void load();
}

abstract class Info{
	public abstract void load();
}




public class Employee extends Info implements Data{

	public void load(){}
	

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
