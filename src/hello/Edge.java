package hello;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge {

	public static void main(String[] args) {
		
		String edgeKey = "webdriver.chrome.driver";
		String edgePath ="C:\\Users\\Emad\\Downloads\\edgedriver_win64\\msedgedriver.exe";
		
		
		System.setProperty(edgeKey, edgePath);
		
		WebDriver driver = new EdgeDriver();
		
		System.out.println("Hello World");
		
		
	}

}
