package br.com.blogspot.ferpiolli.test.suite;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.openqa.selenium.WebDriver;

import br.com.blogspot.ferpioli.common.Property;
import br.com.blogspot.ferpioli.common.Selenium;
import br.com.blogspot.ferpioli.test.FormularioSimplesPageValidation;
import br.com.blogspot.ferpioli.test.HomePageValidation;
/**
 * Classe que agrupa todas as classes de teste, funcionando com uma suíte de regressão.
 * @author jcan
 *
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ 
	HomePageValidation.class,
	FormularioSimplesPageValidation.class,
	})

public class AllTests {
protected static WebDriver driver;
	
	public static Boolean isAllTestsExecution = false;
	
	@BeforeClass
	public static void beforeClass() throws Exception {
		isAllTestsExecution = true;
		driver = Selenium.getDriver();
		driver.navigate().to(Property.SITE_ADDRESS);
	}

	@AfterClass
	public static void afterClass() throws Exception {
		driver.quit();
	}

}
