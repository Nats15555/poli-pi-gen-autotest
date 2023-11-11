package test.page.login;

import static org.junit.jupiter.api.Assertions.assertTrue;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.extension.ExtendWith;
import test.AbstractTest;
import test.TestListener;

@ExtendWith(TestListener.class)
public class TestLoginPage extends AbstractTest {

    @BeforeEach
    public void login() {
        mainPage = loginPage.doLogin(user);
    }

    @Description("Тест на авторизацию")
    @Owner("Nikolay Borisenko")
    @Test
    public void authorization() {
        assertTrue(mainPage.isAuth(user));
    }
}

