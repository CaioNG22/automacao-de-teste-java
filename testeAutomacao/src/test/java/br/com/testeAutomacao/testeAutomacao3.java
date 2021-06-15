package br.com.testeAutomacao;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testeAutomacao3 {
	
//	Terceira parte
//
//	Funcionalidade: Cadastrar usuário existente
//
//	Cenário: Registrar um usuário existente
//
//	Dado: que navego para a página inicial do link https://opentdb.com/
//
//	E: clico no botão LOGIN
//	E: clico no botão REGISTER
//	E: informo o USERNAME
//	E: informo o PASSWORD
//	E: informo o mesmo PASSWORD
//	E: informo o Email
//
//	Quando: clico no botão REGISTER
//
//	Então: visualizo uma mensagem erro com o texto 'ERROR! Email Address already exists!'

	String url;
	WebDriver driver;	
	
	@Test
	public void iniciar() 
	{
		url = "https://opentdb.com/"; 
		System.setProperty("webdriver.chrome.driver", "C:\\browser\\chromedriver.exe");	
		ChromeDriver driver = new ChromeDriver();
		
		driver.get(url);		
		
		driver.findElement(By.linkText("LOGIN")).click(); 
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("username")).sendKeys("alunouna123");
		driver.findElement(By.name("password")).sendKeys("alunouna123");
		driver.findElement(By.name("password_again")).sendKeys("alunouna123");
		driver.findElement(By.name("email")).sendKeys("aluno123@gmail.com");
		driver.findElement(By.id("email")).sendKeys(Keys.ENTER);
		
		String erro = driver.findElement(By.className("alert-danger")).getText();	
		assertEquals("ERROR! Email Address already exists!",erro);		
		
	}
	
}

