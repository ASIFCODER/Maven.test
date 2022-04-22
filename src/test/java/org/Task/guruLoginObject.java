package org.Task;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class guruLoginObject extends Baseclass {

	public guruLoginObject() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="uid"			)
	private WebElement user;   	
	
	@FindBy(xpath="//input[@name=\"password\"]")
	private WebElement password;
	
	@FindBy(xpath="//input[@name=\"btnLogin\"]")
	private WebElement login;

	public WebElement getUser() {
		return user;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}
	
	
	
	
	
	
	
	
	
	
	
}
