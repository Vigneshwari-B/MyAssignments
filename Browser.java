package week2.day2;

public class Browser {
	
	public String launchBrowser(String browserName) {
			
		System.out.println(browserName);
		System.out.println("Browser Launched successflly");
		return browserName;
	}
	
	public void loadUrl() {
		System.out.println("Application url loaded successfully");
		
	}

	public static void main(String[] args) {
		Browser launch=new Browser();
		launch.launchBrowser("Chrome");
		launch.loadUrl();
		}
	
}