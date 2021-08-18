package com.sapiensacademy.tarea;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TareaCarrito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		WebDriver customDriver = new ChromeDriver();
		customDriver.get("https://winstoncastillo.com/robot-selenium/index.php?route=common/home");
		
		
	}

}
