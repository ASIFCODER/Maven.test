package org.Task;

import org.apache.hc.client5.http.impl.classic.MainClientExec;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GurulogInPage extends Baseclass {
	@Test
	public void guruLogIn() throws Exception {
		launchbrowser("https://www.demo.guru99.com/V4/index.php");
		guruLoginObject g = new guruLoginObject();
		String usernamedata = readexceldata(1, 0);
		String passdata = readexceldata(1, 1);
		sendkeys(g.getUser(), usernamedata);
		sendkeys(g.getPassword(), passdata);
		click(g.getLogin());
		QuitBrowser();
		System.out.println("THIS IS KHAN");

	}
}
