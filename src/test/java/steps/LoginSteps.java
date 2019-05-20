package steps;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.Тогда;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginSteps {

    WebDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Tools\\WebDrivers\\chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
        this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
    }

    @Дано("^пользователь заходит на сайт \"([^\"]*)\"$")
    public void пользователь_заходит_на_сайт(String siteName) throws Throwable {
        String siteURL;

        switch(siteName){
            case "stackoverflow":
                siteURL = "http://stackoverflow.com/";
                break;
            default:
                siteURL = "http://google.com/";
        }

        driver.get(siteURL);
    }

    @Дано("^пользователь нажимает кнопку \"([^\"]*)\"$")
    public void пользователь_нажимает_кнопку(String buttonName) throws Throwable {

        switch (buttonName){
            case "Login on login form":
                driver.findElement(By.xpath("//button[@name=\"submit-button\"]")).click();
                break;
            default:
                driver.findElement(By.xpath("//a[contains(text(),\"Log In\")]")).click();
        }
        Thread.sleep(3000);
    }

    @Дано("^пользователь вводит валидный username$")
    public void пользователь_вводит_валидный_username() throws Throwable {
        driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("webdriveruniversity2@mail.com");
    }

    @Дано("^пользователь вводит валидный password$")
    public void пользователь_вводит_валидный_password() throws Throwable {
        driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("Yellow321!");
    }

    @Тогда("^пользователь переходит на страницу успешного входа$")
    public void пользователь_переходит_на_страницу_успешного_входа() throws Throwable {
        Thread.sleep(3000);
        WebElement askQuestionButton = driver.findElement(By.xpath("//a[contains(@href,\"ask\") and contains(text(),\"Ask Question\")]"));
        Assert.assertTrue(askQuestionButton.isDisplayed());
    }
}
