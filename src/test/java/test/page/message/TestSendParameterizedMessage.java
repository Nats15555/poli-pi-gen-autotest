package test.page.message;

import io.qameta.allure.Description;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import test.AbstractTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestSendParameterizedMessage extends AbstractTest {
    @BeforeEach
    public void login() {
        mainPage = loginPage.doLogin(user);
    }

    @Description("Тест на отправку сообщений использую параметризацию")
    @ParameterizedTest
    @ValueSource(strings = {"Это сообщение для теста 1", "Это сообщение для теста 2"})
    public void sendValueSourceMessages(String message) {
        assertTrue(mainPage.openMessageFriendOnMainPage()
                .sendMessage(message)
                .chekMessage(message));
    }
}
