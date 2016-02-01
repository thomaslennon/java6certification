package javatest.scjp;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest {
	
	public void doSomethingWithLocale(){
		Locale.setDefault(Locale.US);
		Locale locale = new Locale("FR");
		ResourceBundle mybundle = ResourceBundle.getBundle("ButtonLabel", locale);
		
	}
	
	
	public static void main(String args[]){
		Locale aLocale = Locale.US;
		Locale.setDefault(aLocale);
		System.out.println("" + aLocale.getDisplayCountry() );
	}

}
