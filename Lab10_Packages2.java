// Inside a different package named 'newpack'
package newpack;
import mypack.Lab10_Packages1;
public class Lab10_Packages2 {
	public static void main(String[] args) {
		Lab10_Packages1 myPackageObject = new Lab10_Packages1();
		myPackageObject.displayMessage();
		int result = Lab10_Packages1.addNumbers(5, 3);
		System.out.println("Result of adding numbers: " + result);
	}
}
