package com.examples.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.thoughtworks.selenium.*;


public class Junit_testcase extends SeleneseTestBase{
	
	@Before
	public void setUp(){
		selenium = new DefaultSelenium("localhost",4444,"*chrome","http://www.cisco.com/cisco/psn/web/catalog");
		selenium.start();
	}
	
	@Test
	public void test_login(){
		selenium.open("http://www.google.com");

	}
	
	
@After
public void tearDown(){
	selenium.stop();
}
	

	

}
