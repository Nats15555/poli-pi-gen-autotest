package test.friend;

import io.qameta.allure.Description;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import test.AbstractTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestGoToFriend extends AbstractTest {
    @BeforeEach
    public void login() {
        mainPage = loginPage.doLogin(user);
    }

    @Description("Тест, переход на страницу друга")
    @Test
    public void testGoToFriend() {
        assertEquals("search150 search150", mainPage.openFriendPage().clickOnFirstFriend().getFriendName());
    }
}
