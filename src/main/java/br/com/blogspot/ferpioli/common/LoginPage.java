package br.com.blogspot.ferpioli.common;


import static org.junit.Assert.assertTrue;
import br.org.cesar.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.WebDriverWait;



/**
 * Executa todas as acoes na pagina de Login
 */
public class LoginPage {

	/**
	 * Instancia privada do webDriver que vira da suite de teste
	 */
	private static final WebDriver driver;
	//private static final WebDriverWait wait;

	/**
	 * Construtor que ira adicionar a instancia do WebDriver para utilizacao dos metodos
	 */
	static {
		driver = Selenium.getDriver();
		//wait = new WebDriverWait(driver, 10);
	}
	
	 /**
	  *  Localizadores de elementos da tela
	  */
	
	static By loginField = By.name("txtUsuario");
	static By passlField = By.name("txtSenha");
	static By butonLogin = By.className("btn btn-lg btn-success btn-block");
	static By enviarButtonLocator = By.name("formulario:logar");
	static By menu = By.id("iconmenuForm:formMenu:menu111");
	
	
	public LoginPage() {
	}

	
	
	/**
	 * Preenche o campos usuario e senha
	 */
	public static void informaUsuario(String usuario, String senha){
			Utils.isClickable(loginField);
		    driver.findElement(loginField).clear();
			driver.findElement(loginField).sendKeys(usuario);
			driver.findElement(passlField).clear();
			driver.findElement(passlField).sendKeys(senha);
			//Utils.desloga();
	}

	
     /**
	 * Clica no botão logar
	 */
	public static void clickEnviarButton(){
		Utils.isClickable(enviarButtonLocator);
		driver.findElement(enviarButtonLocator).click();
	}
	

	
	/**
	 * Verifica sistema logado com sucesso
	 */
	public static boolean assertSuccessLogin(String Usuario){
		        boolean  achouUsuario = driver.getPageSource().contains(Usuario);
                assertTrue(achouUsuario);
                return (achouUsuario);
	}
	
	/* * Método para verificar para fechar janela de mensagens da see
	 */
	public static void mensagemSee() {
		Utils.isClickable("okFecharJanela");
        WebElement botaofecha = driver.findElement(By.id("okFecharJanela"));
        botaofecha.click();
	}
	
	/**
	 * Verifica se o titulo da página (exibido no navegador) é o esperado
	 */
	
	public static boolean garanteSistemaLogou(String nomeInstituicao){
		
		boolean achouinstituicao = driver.getPageSource().contains(nomeInstituicao);
		    
		 return (achouinstituicao);
            
                        
	}
	
	/* * Método para verificar para fechar janela de mensagens de erro de login
	 */
	public static void fechamensagemErroLogin() {
		WebElement botaofecha = driver.findElement(By.id("ok3"));
        Utils.isClickable("ok3");
        botaofecha.click();
	}
	
		
		
}
