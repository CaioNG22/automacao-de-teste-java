package br.com.testeAutomacao;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testeAutomacao2 {

//  Segunda Parte
	
//	Funcionalidade: Busca no Banco de Questões por categoria
	
//	Cenário: Verificar quantidade de linhas e se há uma paginação
	
//	Dado que navego para a página de busca do banco de questões
	
//	E digito 'Science: Computers' no campo de busca
//	E seleciono categoria (Category) no campo de tipo
	
//	Quando clico no botão de buscar (Search)
//	Então visualizo uma pagina com 25 itens e uma paginação.

	String url;
	WebDriver driver;	
	
	@Test
	public void iniciar() 
	{
		url = "https://opentdb.com/"; 
		System.setProperty("webdriver.chrome.driver", "C:\\browser\\chromedriver.exe");	
		ChromeDriver driver = new ChromeDriver();
		
		driver.get(url);		
		
		driver.findElement(By.linkText("BROWSE")).click(); //clicar botão		
		driver.findElement(By.name("query")).sendKeys("Science: Computers"); //digitar palavras		
		driver.findElement(By.name("type")).sendKeys("Category"); 
		driver.findElement(By.className("btn-sm")).click(); //clicar no nome do botão
		
		
		equals(driver.findElement(By.xpath("//*[@id=\"page-top\"]/div[2]/table/tbody/tr[25]")));
		
		equals(driver.findElementByClassName("pagination-lg") ); //verifica se há essa classe na página
		
		
	
		
	}
	
}
