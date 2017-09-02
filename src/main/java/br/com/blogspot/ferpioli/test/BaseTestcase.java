package br.com.blogspot.ferpioli.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.com.blogspot.ferpioli.common.HomePage;
import br.com.blogspot.ferpioli.common.Property;
import br.com.blogspot.ferpioli.common.Selenium;
import br.com.blogspot.ferpiolli.test.suite.AllTests;

/**
 * Classe base de testes, que inicializa o driver no início dos testes e encerra o driver ao final da execução.
 * @author jcan
 *
 */
public class BaseTestcase {
	protected static HomePage homePage;
	protected static WebDriver driver;
	
	@BeforeClass
	public static void beforeClass() throws Exception {	
		if (!AllTests.isAllTestsExecution){
			driver = Selenium.getDriver();
			driver.navigate().to(Property.SITE_ADDRESS);
			driver.manage().window().maximize();
		}
	}
	
	@AfterClass
	public static void afterClass() throws Exception {
		if (!AllTests.isAllTestsExecution){
			driver.quit();
		}
	}
	
	
}
