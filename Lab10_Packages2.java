// Inside the folder named 'newpack'
package newpack;
import mypack.Lab10_Packages1;
public class Lab10_Packages2 {
	public static void main(String[] args) {
		// Creating an instance of Lab10_Packages from the myPack package
		Lab10_Packages2 myPackageObject = new Lab10_Packages2();

		// Calling the displayMessage method from Lab10_Packages
		myPackageObject.displayMessage();

		// Using the utility method addNumbers from Lab10_Packages
		int result = Lab10_Packages2.addNumbers(5, 3);
		System.out.println("Result of adding numbers: " + result);
	}
}
