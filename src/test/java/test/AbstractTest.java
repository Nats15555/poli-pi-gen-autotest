package test;


import data.login.User;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;
import page.login.LoginPage;
import page.main.MainPage;

public abstract class AbstractTest {
    public static WebDriver driver;
    protected LoginPage loginPage;
    protected MainPage mainPage;
    protected final User user = new User.UserBuilder()
            .withLogin("search149")
            .withPassword("YwssyDn6")
            .withNameAndSurname("search149 search149")
            .build();

    @BeforeEach
    public void start() {
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        //options.addArguments("--headless");
        driver = new ChromeDriver(options);
        loginPage = new LoginPage(driver);
        mainPage = new MainPage(driver);
        driver.get("https://ok.ru");
    }

    /*@AfterEach
    public void end() {
        driver.close();
    }*/

}
