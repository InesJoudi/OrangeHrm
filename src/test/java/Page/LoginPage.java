package Page;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;


public class LoginPage {

@FindBy (xpath="/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")
WebElement username;

@FindBy (xpath="/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")
WebElement password;

@FindBy (xpath="/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
WebElement login;

@FindBy(xpath="/html/body/div/div[1]/div[1]/header/div[1]/div[1]/span/h6")
WebElement verifSuccess;

@FindBy (xpath="/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p")
WebElement verifdecline;

public LoginPage() {
	
	PageFactory.initElements(Config.driver, this);
	}
	

public void connect (String name, String pwd) {
	Config.attents(10);
username.sendKeys(name);
password.sendKeys(pwd);
login.click();

}


public void verifTitleS (String sucess ) {
	Config.attents(10);
	String verifTitlesTex= verifSuccess.getText();
	Assert.assertEquals(verifTitlesTex, sucess);

}
	
public void verifTitlesD (String decline)	{
	Config.attents(10);
	String veriftitlesDTex= verifdecline.getText();
	
	Assert.assertEquals(veriftitlesDTex, decline);
		
}
	
	
	
	
	
}
