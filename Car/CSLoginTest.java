package com.example.tests;

import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.Pattern;

public class CSLoginTest {
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "http://192.168.1.27:8087/");
		selenium.start();
	}

	@Test
	public void testCSLogin() throws Exception {
		selenium.open("http://192.168.1.27:8087/car/");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("//table[@id='tableheight']/tbody/tr/td/div/div/div/div[2]/table/tbody/tr/td")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.type("//input[@id='j_username']", "wangyang");
		selenium.type("//input[@id='j_password']", "123");
		selenium.click("//a[@onclick='submit_form()']");
		selenium.waitForPageToLoad("30000");
		selenium.mouseOver("//div[@class='hearderBar_user']");
		assertTrue(selenium.isVisible("//span[@id='userInfoLink']"));
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("//div[@id='headerbar']")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
