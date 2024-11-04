package eduVidya;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.WebElement;

public class Main {

	public static void main(String[] args) throws FileNotFoundException{
		Scanner sc = new Scanner(System.in);
		Locator locator = new Locator();
		locator.createProperty();
		System.out.println("Enter the browser you want to test on:");
		String browserName = sc.nextLine(); 
		locator.createDriver(browserName);
		
		locator.findCollegeElement();
		
		locator.selectOptions();
		
		List<WebElement> result = locator.searchResults();
		
		if(result.size()>0) {
			System.out.println("Colleges Displayed");
		}
		else {
			System.out.println("No college is available");
		}
		
		locator.closeDriver();
		sc.close();
		
	}

}
