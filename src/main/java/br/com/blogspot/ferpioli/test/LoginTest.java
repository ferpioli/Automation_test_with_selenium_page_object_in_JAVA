package br.com.blogspot.ferpioli.test;
import br.com.blogspot.ferpioli.common.HomePage;
import br.com.blogspot.ferpioli.common.LoginPage;
import br.org.cesar.util.Utils;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.TimeoutException;

@FixMethodOrder(MethodSorters.JVM)
/**
 * Classe de testes com cenários relacionados a página de login
 */
public class LoginTest extends BaseTestcase{
	

	

	@Test
	/**
	 * Caso de teste: executa login com usuario correto e senha incorreta
	 */
	public void loginSenhaIncorreta() {
		      //LoginPage.mensagemSee();
		      LoginPage.informaUsuario("02533728647", "1111111");
              LoginPage.clickEnviarButton();
              LoginPage.assertSuccessLogin("Usuário ou senha inválidos");
             
    }
	@Test
	/**
	 * Caso de teste: executa login com usuario correto e senha incorreta
	 */
	public void loginUsuarioIncorreto() {
			//LoginPage.mensagemSee();
			LoginPage.informaUsuario("111111111", "123456");
            LoginPage.clickEnviarButton();
            LoginPage.assertSuccessLogin("Usuário ou senha inválidos.");
              
    }
	
	@Test
	/**
	 * Caso de teste: executa login com os campos vazios
	 */
	public void loginCamposVazios() {
			  //LoginPage.mensagemSee();
              LoginPage.informaUsuario("","");
              LoginPage.clickEnviarButton();
              LoginPage.assertSuccessLogin("Usuário ou senha inválidos");
              LoginPage.fechamensagemErroLogin();
              
    }
	
	@Test
	/**
	 * Caso de teste: executa login com usuario e senha corretos
	 */
	
	public void loginSuccessfully() {
		try{
		        //LoginPage.mensagemSee();
		        LoginPage.informaUsuario("02000728647", "123456");
		        LoginPage.clickEnviarButton();
		        LoginPage.assertSuccessLogin("JANDIRA DE MAGALHÃES");
		        HomePage.clickSubMenuSolicitarSair();}
		       // Utils.desloga();}
		        catch (TimeoutException t) {
		        	Utils.takeScreenshot("failed");
		        	Assert.fail();
		        					
				}
		        
	}
	
		
	
}
	
	

