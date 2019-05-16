package steps;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.Тогда;
import org.openqa.selenium.WebDriver;
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
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Дано("^пользователь нажимает кнопку \"([^\"]*)\"$")
    public void пользователь_нажимает_кнопку(String buttonName) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Дано("^пользователь вводит валидный username$")
    public void пользователь_вводит_валидный_username() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Дано("^пользователь вводит валидный password$")
    public void пользователь_вводит_валидный_password() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Тогда("^пользователь переходит на страницу успешного входа$")
    public void пользователь_переходит_на_страницу_успешного_входа() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
