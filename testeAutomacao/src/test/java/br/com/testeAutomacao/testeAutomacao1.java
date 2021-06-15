package br.com.testeAutomacao;
import static org.junit.Assert.assertEquals;
import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testeAutomacao1 {

//  Primeira Parte
	
//	Funcionalidade: Busca no Banco de Questões
//	Cenário: Busca por questão inexistente
//	Dado que navego para a página de busca do banco de questões
//	E digito 'Science: Computers' no campo de busca
//	Quando clico no botão de buscar
//	Então visualizo uma mensagem de erro com o texto 'No questions found.'
		
	String url;
	WebDriver driver;	
	
	@Test
	public void iniciar() 
	{
		url = "https://opentdb.com/"; // site que será aberto
		System.setProperty("webdriver.chrome.driver", "C:\\browser\\chromedriver.exe");	//caminho do plugin do chrome
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS); // tempo limite
		
		driver.get(url);	//abrir site	
		driver.findElement(By.linkText("BROWSE")).click(); //clicar botão		
		driver.findElement(By.name("query")).sendKeys("Science: Computers"); //digitar palavras	
		driver.findElement(By.id("query")).sendKeys(Keys.ENTER);//executar uma ação de um botão
		
		//leitura de texto do site e conferir(string)
		String erro = driver.findElement(By.className("alert-danger")).getText();	//ele procura a classe e pega o texto da classe 	
		assertEquals("No questions found.",erro); // verifica se a string confere com o que está no objeto
	}
	
}
