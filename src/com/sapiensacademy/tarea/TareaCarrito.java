package com.sapiensacademy.tarea;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TareaCarrito {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		WebDriver customDriver = new ChromeDriver();
		customDriver.get("https://winstoncastillo.com/robot-selenium/index.php?route=common/home");
		customDriver.manage().window().maximize();
		Assert.assertEquals(customDriver.getTitle(), "La tienda de Winston Castillo");
		WebElement listaProductos = customDriver.findElement(By.xpath("//*[@id=\"content\"]/div[2]"));
		List <WebElement> itemsPantalla = listaProductos.findElements(By.tagName("h4"));
		System.out.println("Número de items mostrados:" + " " + itemsPantalla.size());
		System.out.println("Productos en el carrito: " + " " + customDriver.findElement(By.id("cart-total")).getText());
		Assert.assertEquals(customDriver.findElement(By.id("cart-total")).getText(), "0 item(s) - $0.00");
		
		/*customDriver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[3]/button[2]")).click();
		System.out.println(customDriver.findElement(By.xpath("//*[@id=\"common-home\"]/div[1]")).getText());
		Assert.assertEquals(customDriver.findElement(By.xpath("//*[@id=\"common-home\"]/div[1]")).getText(), "You must login or create an account to save MacBook Pro to your wish list! ×");*/ 
		
		customDriver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[3]/button[1]")).click();
		customDriver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div[3]/button[1]")).click();
		customDriver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[3]/div/div[3]/button[1]")).click();
		Thread.sleep(2000);
		System.out.println("En el carrito se encuentra: " + customDriver.findElement(By.id("cart-total")).getText());
		Assert.assertEquals(customDriver.findElement(By.id("cart-total")).getText(), "3 item(s) - $847.20");
		customDriver.findElement(By.xpath("//*[@id=\"cart\"]/button")).click();
		
		//*[@id="cart"]/button
		
		
		//WebElement contenedorProductos = customDriver.findElement(By.id("content")); */
		
	}

}
