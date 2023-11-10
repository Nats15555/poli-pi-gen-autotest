package test.page.group;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.extension.ExtendWith;
import test.AbstractTest;
import test.TestListener;

import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(TestListener.class)
public class TestAddGroup extends AbstractTest {
    @BeforeEach
    public void login() {
        mainPage = loginPage.doLogin(user);
    }

    @DisplayName("Тест на возможность подписаться на группу")
    @Test
    public void addGroup() {
        assertTrue(mainPage.openGroupPage().subscribeToGroup().checkSubscribeToGroup());
    }
}
