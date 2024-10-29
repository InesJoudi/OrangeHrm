package Page;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class HomePage {

	
	@FindBy (xpath="/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li/a")
	
	List <WebElement> menu;
	
	
	@FindBy (xpath="/html/body/div/div[1]/div[1]/header/div[1]/div[1]/span/h6")
	
	WebElement verif;
	
	
public HomePage() {
		
		PageFactory.initElements(Config.driver, this);
	}
	public void clickToTheMenu (String menuTitle) {
		
		try {
			
			for (WebElement menus:menu) {
				
				if (menus.getText().contains(menuTitle)) {
				
					System.out.println(menus.getText());
		
				menus.click();
					
				}
			}	
		
}catch (Exception e) {
}	
	}
	public void verifTitles (String submenutile) {
		 Config.attents(10);
		String verifTitlesTex=verif.getText();
		
		Assert.assertEquals(submenutile, verifTitlesTex);	
			

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
