package LoginTestSuite;

import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Page.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTestSuites {

	@Given("Admin is on login page")
	public void admin_is_on_login_page() {
		
		 Config.driver=new ChromeDriver();
			
			Config.ConfChrome();
			
			Config.maximize();
			
			String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
			
			 Config.driver.get(url);
			 
	}


	@When("Admin Enter correct username {string} and correct password {string}")
	public void admin_enter_correct_username_and_correct_password(String Admin, String admin123) {
		LoginPage page=new LoginPage();
		 page.connect(Admin,admin123);
	}

@Then("Admin is directed to the home page {string}")
public void admin_is_directed_to_the_home_page(String Dashboard) {
LoginPage page=new LoginPage();
page.verifTitleS(Dashboard);
	}


	@When("Admin enter incorrect username {string} and correct password {string}")
	public void admin_enter_incorrect_username_and_correct_password(String ines, String admin123) {
		 LoginPage page=new LoginPage();
		 page.connect(ines, admin123);
	}

	@Then("admin is still on loginpage {string}")
	public void admin_is_still_on_loginpage(String Invalidcredentials) {
		LoginPage page=new LoginPage();
		page.verifTitlesD(Invalidcredentials);
	}


}
