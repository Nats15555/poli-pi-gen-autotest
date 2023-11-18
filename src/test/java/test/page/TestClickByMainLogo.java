package test.page;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import test.AbstractTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestClickByMainLogo extends AbstractTest {
    @BeforeEach
    public void login() {
        mainPage = loginPage.doLogin(user);
    }

    @Description("Тест на клик по логотипу")
    @Owner("Nikolay Borisenko")
    @Test
    public void authorization() {
        mainPage.openGroupPage();
        assertTrue(mainPage.clickByLogo());
        assertTrue(mainPage.isAuth(user));
    }
}
