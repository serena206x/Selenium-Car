package com.example.tests;

import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.Pattern;

public class CSAddBillsTest {
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "http://192.168.1.27:8087/");
		selenium.start();
	}

	@Test
	public void testCSAddBills() throws Exception {
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

		assertTrue(selenium.isElementPresent("//button[@id='unieapx_layout_NavigatorPane_0button4_unieap_input']"));
		selenium.clickAt("//button[@id='unieapx_layout_NavigatorPane_0button4_unieap_input']", "新增");
		Thread.sleep(NaN);
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
		selenium.type("//input[@id='unieapx_layout_NavigatorPane_1cardname_unieap_input']", "宋二三");
		assertEquals("宋二三", selenium.getValue("//input[@id='unieapx_layout_NavigatorPane_1cardname_unieap_input']"));
		selenium.type("//input[@id='unieapx_layout_NavigatorPane_1phone_unieap_input']", "18080808023");
		assertEquals("18080808023", selenium.getValue("//input[@id='unieapx_layout_NavigatorPane_1phone_unieap_input']"));
		selenium.clickAt("xpath=(//input[@type='radio'])[2]", "女");
		assertTrue(selenium.isVisible("xpath=(//input[@type='radio'])[2]"));
		selenium.type("//input[@id='unieapx_layout_NavigatorPane_1domicile_unieap_input']", "辽宁省沈阳市浑南新区");
		assertEquals("辽宁省沈阳市浑南新区", selenium.getValue("//input[@id='unieapx_layout_NavigatorPane_1domicile_unieap_input']"));
		Thread.sleep(NaN);
		Thread.sleep(NaN);
		Thread.sleep(NaN);
		selenium.clickAt("//input[@id='unieapx_layout_NavigatorPane_1born_unieap_input']", "");
		Thread.sleep(NaN);
		selenium.clickAt("//input[@id='unieapx_layout_NavigatorPane_1nation_unieap_input']", "");
		selenium.type("//input[@id='unieapx_layout_NavigatorPane_1nation_unieap_input']", "汉族");
		selenium.mouseOver("//div[@id='unieap_form_ComboBoxPopup_3']/div[2]/table/tbody/tr/td");
		selenium.clickAt("//div[@id='unieap_form_ComboBoxPopup_3']/div[2]/table/tbody/tr/td", "汉族");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if ("汉族".equals(selenium.getText("//div[@id='unieap_form_ComboBoxPopup_3']/div[2]/table/tbody/tr/td"))) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		assertEquals("汉族", selenium.getValue("//input[@id='unieapx_layout_NavigatorPane_1nation_unieap_input']"));
		selenium.type("//input[@id='unieapx_layout_NavigatorPane_1police_unieap_input']", "辽宁省沈阳市浑南派出所");
		selenium.type("//input[@id='unieapx_layout_NavigatorPane_1passportno_unieap_input']", "110101198001010096");
		selenium.clickAt("//input[@id='unieapx_layout_NavigatorPane_1brand_unieap_input']", "");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isVisible("//div[@id='unieap_form_ComboBoxPopup_4']/div[2]/table/tbody/tr[2]/td/span")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.mouseOver("//div[@id='unieap_form_ComboBoxPopup_4']/div[2]/table/tbody/tr[2]/td");
		selenium.click("//div[@id='unieap_form_ComboBoxPopup_4']/div[2]/table/tbody/tr[2]/td");
		selenium.type("//input[@id='unieapx_layout_NavigatorPane_1car_unieap_input']", "DB11");
		selenium.type("//input[@id='unieapx_layout_NavigatorPane_1carcode_unieap_input']", "LA88888");
		selenium.clickAt("//input[@id='unieapx_layout_NavigatorPane_1itemcode_unieap_input']", "");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isVisible("//div[@id='unieap_form_ComboBoxPopup_5']/div[2]/table/tbody/tr/td")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.mouseOver("//div[@id='unieap_form_ComboBoxPopup_5']/div[2]/table/tbody/tr/td");
		selenium.clickAt("//div[@id='unieap_form_ComboBoxPopup_5']/div[2]/table/tbody/tr/td", "G时贷");
		assertEquals("G时贷", selenium.getValue("//input[@id='unieapx_layout_NavigatorPane_1itemcode_unieap_input']"));
		selenium.clickAt("//input[@id='unieapx_layout_NavigatorPane_1period_unieap_input']", "");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isVisible("//div[@id='unieap_form_ComboBoxPopup_6']/div[2]/table/tbody/tr[2]/td/span")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.mouseOver("//div[@id='unieap_form_ComboBoxPopup_6']/div[2]/table/tbody/tr[2]/td/span");
		selenium.clickAt("//div[@id='unieap_form_ComboBoxPopup_6']/div[2]/table/tbody/tr[2]/td/span", "3月");
		selenium.clickAt("xpath=(//input[@type='radio'])[5]", "个人");
		Thread.sleep(NaN);
		selenium.clickAt("//input[@id='unieapx_layout_NavigatorPane_1slpmanager_unieap_input']", "");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isVisible("//div[@id='unieap_form_ComboBoxPopup_7']/div[2]/table/tbody/tr[2]/td/span")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.mouseOver("//div[@id='unieap_form_ComboBoxPopup_7']/div[2]/table/tbody/tr[2]/td/span");
		selenium.clickAt("//div[@id='unieap_form_ComboBoxPopup_7']/div[2]/table/tbody/tr[2]/td/span", "林晓华");
		assertEquals("林晓华", selenium.getValue("//input[@id='unieapx_layout_NavigatorPane_1slpmanager_unieap_input']"));
		Thread.sleep(NaN);
		selenium.clickAt("//input[@id='unieapx_layout_NavigatorPane_1slpcode_unieap_input']", "");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isVisible("//div[@id='unieap_form_ComboBoxPopup_2']/div[2]/table/tbody/tr/td/span")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.mouseOver("//div[@id='unieap_form_ComboBoxPopup_2']/div[2]/table/tbody/tr/td/span");
		selenium.clickAt("//div[@id='unieap_form_ComboBoxPopup_2']/div[2]/table/tbody/tr/td/span", "王小丽");
		assertEquals("王小丽", selenium.getValue("//input[@id='unieapx_layout_NavigatorPane_1slpcode_unieap_input']"));
		selenium.click("xpath=(//input[@type='radio'])[8]");
		selenium.type("//textarea[@id='unieapx_layout_NavigatorPane_1memo_unieap_input']", "暂无备注");
		selenium.clickAt("//button[@id='unieapx_layout_NavigatorPane_1button1_unieap_input']", "保存");
		assertTrue(selenium.isElementPresent("//td[@class='infoIcon']"));
		selenium.click("//button[@id='unieap_form_Button_0_unieap_input']");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
