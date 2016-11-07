package com.example.tests;

import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.Pattern;

public class CSAssertBillsTest {
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "http://192.168.1.27:8087/");
		selenium.start();
	}

	@Test
	public void testCSAssertBills() throws Exception {
		selenium.open("http://192.168.1.27:8087/car/");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("//a[@id='leftmenu-trigger']")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		assertTrue(selenium.isElementPresent("link=客服流转单"));
		assertTrue(selenium.isElementPresent("link=进件搜索"));
		selenium.clickAt("//div[@class='unieap_menu unieap_menu_icon']", "客服流转单");
		Thread.sleep(NaN);
		assertTrue(selenium.isVisible("//ul[@class='acc-menu']"));
		selenium.clickAt("//ul[@class='acc-menu']/li/a/span", "");
		Thread.sleep(NaN);
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isVisible("//div[@class='u-titlepane-title']")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isVisible("//span[@class='u-titlepane-titlenode']")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		Thread.sleep(NaN);
		selenium.type("//input[@id='unieapx_layout_NavigatorPane_0cardname_unieap_input']", "宋二三");
		selenium.type("//input[@id='unieapx_layout_NavigatorPane_0passportno_unieap_input']", "110101198001010096");
		selenium.clickAt("//button[@id='unieapx_layout_NavigatorPane_0button1_unieap_input']", "查询");
		assertTrue(selenium.isElementPresent("//div[@class='u-grid-text2']"));
		selenium.clickAt("//input[@name='radio_unieapx_layout_NavigatorPane_0grid1']", "宋二三");
		selenium.mouseOver("xpath=(//div[@id='page-0']/div/table/tbody/tr/td/div/div)[15]");
		selenium.click("xpath=(//div[@id='page-0']/div/table/tbody/tr/td/div/div)[15]");
		assertTrue(selenium.isElementPresent("//a[@id='unieapx_layout_NavigatorPane_0button5']"));
		selenium.clickAt("//button[@id='unieapx_layout_NavigatorPane_0button5_unieap_input']", "修改");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isVisible("//form[@id='unieapx_layout_NavigatorPane_1form1']")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		assertTrue(selenium.isVisible("//input[@id='unieapx_layout_NavigatorPane_1cardname_unieap_input']"));
		assertTrue(selenium.isVisible("//input[@id='unieapx_layout_NavigatorPane_1phone_unieap_input']"));
		assertTrue(selenium.isVisible("//input[@id='unieapx_layout_NavigatorPane_1police_unieap_input']"));
		assertTrue(selenium.isVisible("//input[@id='unieapx_layout_NavigatorPane_1passportno_unieap_input']"));
		Thread.sleep(NaN);
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if ("上传附件".equals(selenium.getText("//button[@id='unieapx_layout_NavigatorPane_1button2_unieap_input']"))) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.clickAt("//button[@id='unieapx_layout_NavigatorPane_1button2_unieap_input']", "上传附件");
		selenium.waitForPopUp("fujianguanli", "30000");
		selenium.select("//select[@id='attachtype']", "label=车辆登记证");
		selenium.mouseOver("//img[@id='pickfiles']");
     
        selenium.clickAt("//img[@id='ickfiles']");
        selenium.getWindowTitles();


		Thread.sleep(NaN);
		Thread.sleep(NaN);
		Thread.sleep(NaN);
		Thread.sleep(NaN);
		selenium.clickAt("//div[@id='table-border']/div/div", "");
		selenium.click("//img[@id='uploadfiles']");
		selenium.click("xpath=(//button[@type='button'])[2]");
		selenium.click("//img[@id='uploadfiles']");
		selenium.click("//button[@type='button']");
		selenium.click("//img[@id='uploadfiles']");
		// selenium.();
		selenium.clickAt("//button[@id='unieapx_layout_NavigatorPane_2button2_unieap_input']", "上传附件");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
