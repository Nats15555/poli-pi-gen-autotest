package test.language;

import io.qameta.allure.Description;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import test.AbstractTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LanguageTest extends AbstractTest {
    @BeforeEach
    public void login() {
        mainPage = loginPage.doLogin(user);
    }

    @Description("Тест на смену языка")
    @Test
    public void languageTest() {
        assertTrue(mainPage.clickLanguageList().clickLanguageEng().chekLanguage("English"));
        mainPage.clickLanguageList().clickLanguageRu();
    }
}
