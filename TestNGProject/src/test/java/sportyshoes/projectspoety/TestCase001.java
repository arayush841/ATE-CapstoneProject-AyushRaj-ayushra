package sportyshoes.projectspoety;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase001 {
    LibraryClass page = new LibraryClass();
    WebDriver driver = new ChromeDriver();
    
    @BeforeTest
    public void init() {
        page.InitDriver(driver);
    }
    
    @Test
    public void testMethod() throws InterruptedException {
        page.launchApp("https://neemans.com/"); // launching the app
        Thread.sleep(500);
        page.clickOn("//*[@id=\"full-new-announcement\"]/div[2]/ul/li[1]/a"); // clicking on signup login .
        Thread.sleep(500);
        page.clickOn("//*[@id=\"customer_login\"]/div[4]/a"); // clicking on the create new account button .
        Thread.sleep(500);
        page.TypeSomthing("//*[@id=\"create_customer\"]/div[3]/input", "ayush");
        page.TypeSomthing("//*[@id=\"create_customer\"]/div[4]/input", "abc");
        page.TypeSomthing("//*[@id=\"create_customer\"]/div[5]/input", "ayush@abc.com");
        page.TypeSomthing("//*[@id=\"create_customer\"]/div[6]/input", "12345678");
        page.clickOn("//*[@id=\"create_customer\"]/button");
        Thread.sleep(500);
        page.clickOn("//*[@id=\"full-new-announcement\"]/div[2]/ul/li[1]/a"); // clicking on login .
        Thread.sleep(500);
        page.TypeSomthing("//*[@id=\"customer_login\"]/div[2]/input", "ayush@abc.com");
        page.TypeSomthing("//*[@id=\"customer_login\"]/div[3]/input", "12345678");
        page.clickOn("//*[@id=\"customer_login\"]/button");
        driver.navigate().back();
        Thread.sleep(500);
        page.clickOn("//*[@id=\"section-header\"]/div/div[1]/nav/ul/li[1]/a");
        Thread.sleep(500);
        page.clickOn("//*[@id=\"ProductImagesContainer--0\"]/div/div/div[2]/div/div[3]/a");
        Thread.sleep(500);
        page.clickOn("//*[@id=\"product_form_7206377816107\"]/div[2]/button");
        page.clickOn("//*[@id=\"product_form_7206377816107\"]/div[2]/div/div[1]/div[2]/div[2]/label");
        Thread.sleep(500);
        driver.navigate().back();
        Thread.sleep(500);
        page.clickOn("//*[@id=\"ProductImagesContainer--2\"]/div/div/div[3]/div/div[3]/a");
        Thread.sleep(500);
        page.clickOn("//*[@id=\"product_form_7167846645803\"]/div[2]/button");
        page.clickOn("//*[@id=\"product_form_7167846645803\"]/div[2]/div/div[1]/div[2]/div[3]/label");
        page.clickOn("//*[@id=\"sidebar-cart\"]/form/div[1]/div[3]/div/div/div/div[2]/div[2]/div/div/a[2]");
        page.clickOn("//*[@id=\"button-gokwik\"]");
    }
}
