package br.ce.gustavoivo.tasks.functional;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TasksTest {
	
	@Test
	public void DeveSalvarTarefacomSucesso() {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://localhost:8001/tasks/");
		
		//Clicar em Add Todo
		driver.findElement(By.id("addTodo")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		
		// Escrever descrição
		driver.findElement(By.id("task")).sendKeys("Teste via Selenium");
		
		//Escrever a data
		driver.findElement(By.id("dueDate")).sendKeys("10/10/2030");
			
		//clicar em salvar
		driver.findElement(By.id("saveButton")).click();
		
		//validar mensagem de sucesso
		driver.findElement(By.id("message")).getText();
	    //fechar o browser
		driver.quit();
	}

}
