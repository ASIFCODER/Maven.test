package org.Task;

import org.junit.Test;

public class fbLogInpage extends Baseclass {
	@Test
	public void fbLogIn() throws Exception {
		launchbrowser("https://www.facebook.com/");
		fbLoginObject fb = new fbLoginObject();
		String usernamedata = readexceldata(2, 0);
		String passdata = readexceldata(2, 1);
		sendkeys(fb.getUser(), usernamedata);
		sendkeys(fb.getPassword(), passdata);
		click(fb.getLogin());
		QuitBrowser();
	
	
	
	
	

}}
