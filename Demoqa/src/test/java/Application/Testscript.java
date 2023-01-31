package Data;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testscript {
    WebDriver driver;



    @Test (priority = 1)
    //this will open the browser up (basically connecting to the web)
    public void SetUp(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }

    @Test (priority = 2)
    //this one will load the designated website to test
    public void openbrowser() throws InterruptedException{
        driver.get("https://shop.demoqa.com/shop/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }

    @Test (priority = 3)
    public void Dismiss() throws InterruptedException {
        WebElement dismisslink = driver.findElement(By.linkText("Dismiss"));dismisslink.click();
        Thread.sleep(2500);
    }


/*
Sgb@hotmail.com

    }*/

   @Test (priority = 4)
    public void Navaccount(){

        try{
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"noo-site\"]/header/div[1]/div/ul[2]/li[2]/a")).click();
            Thread.sleep(3000);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    @Test (priority = 5)
    public void Login() throws InterruptedException {
        driver.findElement(By.id("username")).sendKeys("Samad-Aziz");
        Thread.sleep(2000);

        driver.findElement(By.id("password")).sendKeys("snqA2@Yztz5CxKp");
        Thread.sleep(2500);

        driver.findElement(By.name("login")).click();

        Thread.sleep(2500);
        driver.get("https://shop.demoqa.com/shop/");

    }

@Test (priority = 6)
    public void addtocart() throws InterruptedException {

        try{
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"noo-site\"]/div[2]/div[2]/div/div/div[1]/div/div[1]/div[2]/div[1]/div/div[1]/a/img")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@id=\"product-1162\"]/div[1]/div[2]/form/div/div[2]/button")).click();

            driver.get("https://shop.demoqa.com/shop/");

            /*Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"noo-site\"]/div[2]/div[2]/div/div/div[5]/div/div[1]/div[2]/div[1]/div/div[1]/a/img")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@id=\"product-1225\"]/div[1]/div[2]/form/div/div[2]/button")).click();

            driver.get("https://shop.demoqa.com/shop/");

            driver.findElement(By.xpath("//*[@id=\"noo-site\"]/div[2]/div[2]/div/div/div[15]/div/div[1]/div[2]/div[1]/div/div[1]/a/img")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@id=\"product-1371\"]/div[1]/div[2]/form/div/div[2]/button")).click();

            driver.get("https://shop.demoqa.com/shop/");*/

        }
        catch(Exception e){
            e.printStackTrace();
        }
}




    /*
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@id=\"noo-site\"]/div[2]/div[2]/div/div/div[15]/div")).click();
            Thread.sleep(3000);



   @Test (priority = 7)
    public void Gotobasket() throws InterruptedException {

        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"nav-menu-item-cart\"]/a/span/i")).click();
    }*/

   /*  @Test (priority = 6)
    public void Checkout() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
    }

    @Test (priority = 7)
    public void Entpersonalinfo() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.id("first-name")).sendKeys("Samad-Aziz");
        Thread.sleep(2500);

        driver.findElement(By.id("last-name")).sendKeys("Standard-User");
        Thread.sleep(2500);

        driver.findElement(By.id("postal-code")).sendKeys("8001");
        Thread.sleep(2500);

        driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
    }
    @Test(priority = 8)
    public void Finish() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"finish\"]")).click();

    }

    @Test (priority = 9)
    public void backtohome() throws InterruptedException {
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"back-to-products\"]")).click();
    }

    @Test (priority = 10)
    public void menu() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]")).click();
    }

    @Test (priority = 11)
    public void Logout() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[1]/div/div[2]/div[1]/nav/a[3]")).click();
    }

    @Test(priority = 12)
    public void Teardown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

}*/

}
