package LoginTestSuite;

import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Page.HomePage;
import Page.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeOrangeTestSuite {

	
	@Given("Admin est bien connectee avec username {string} et password {string}")
	public void admin_est_bien_connectee_avec_username_et_password(String Admin, String admin123) {
		Config.driver=new ChromeDriver();
		
		Config.ConfChrome();
		
		Config.maximize();
		
		String url="https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers";
		
		 Config.driver.get(url);
		 LoginPage page= new LoginPage();
		 
		 page.connect(Admin, admin123);
	}

	@When("Admin clique sur le menu {string}")
	public void admin_clique_sur_le_menu(String menus) {
	   HomePage pages=new HomePage();
	   pages.clickToTheMenu(menus);
	}

	@Then("Admin sur la page de menu cliquee {string}")
	public void admin_sur_la_page_de_menu_cliquee(String submenutile) {
	  
	    HomePage pages=new HomePage();
	    
	  pages.verifTitles(submenutile);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
