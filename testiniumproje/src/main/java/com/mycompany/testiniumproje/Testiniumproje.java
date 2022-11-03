

package com.mycompany.testiniumproje;


import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Testiniumproje {

    public static void main(String[] args) {
       
        WebDriverManager.chromedriver().setup();
        
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.amazon.com.tr");
     driver.manage().window().maximize();
       
     WebElement cookies =driver.findElement(By.id("sp-cc-accept"));
     cookies.click();
     
     WebElement arama=driver.findElement(By.id("twotabsearchtextbox"));
        
       arama.sendKeys("ceket");
    
       arama.submit();
       
     JavascriptExecutor js=(JavascriptExecutor) driver;  
     js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
      
    
    driver.get("https://www.amazon.com.tr/s?k=ceket&page=2&__mk_tr_TR=%C3%85M%C3%85%C5%BD%C3%95%C3%91&crid=LVX5IATVAQUI&qid=1667503243&sprefix=%2Caps%2C115&ref=sr_pg_1");
    
    driver.get("https://www.amazon.com.tr/WenVen-klasik-askeri-mevsimlik-fermuarl%C4%B1/dp/B07RFLXHPY/ref=sr_1_70_sspa?__mk_tr_TR=%C3%85M%C3%85%C5%BD%C3%95%C3%91&crid=LVX5IATVAQUI&keywords=ceket&qid=1667503763&qu=eyJxc2MiOiI5LjQzIiwicXNhIjoiOC4yMyIsInFzcCI6IjUuODUifQ%3D%3D&sprefix=%2Caps%2C115&sr=8-70-spons&psc=1");
    
    WebElement fiyat =driver.findElement(By.id("dynamicDeliveryMessage"));
    fiyat.click();
    
  WebElement sepet =driver.findElement(By.id("add-to-cart-button"));
    sepet.click();
    
    WebElement git=driver.findElement(By.id("sw-gtc"));
    git.click();
    }
}
