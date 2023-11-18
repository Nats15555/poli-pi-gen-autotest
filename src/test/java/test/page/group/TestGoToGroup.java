package test.page.group;

import io.qameta.allure.Description;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import page.group.GroupPage;
import test.AbstractTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestGoToGroup extends AbstractTest {
    @BeforeEach
    public void login() {
        mainPage = loginPage.doLogin(user);
    }

    @Description("Тест, переход на страницу группы")
    @Test
    public void testGoToGroup() {
        GroupPage groupPage = mainPage.openGroupPage();
        String nameBefore = groupPage.getNameBefore();
        groupPage.clickOnFirstGroup();
        assertEquals(nameBefore, groupPage.getNameAfter());
    }
}