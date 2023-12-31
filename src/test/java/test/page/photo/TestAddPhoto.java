package test.page.photo;

import java.io.File;
import java.nio.file.Path;


import static org.junit.jupiter.api.Assertions.assertTrue;

import io.qameta.allure.Description;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import test.AbstractTest;

public class TestAddPhoto extends AbstractTest {
    private final Path photoAvatarPath = new File("src/main/resources/avatar.png").getAbsoluteFile().toPath();

    @BeforeEach
    public void login() {
        mainPage = loginPage.doLogin(user);
    }

    @Description("Тест на добавления фото к себе")
    @Test
    public void addNewPhoto() {
        assertTrue(mainPage.openPhotoPage()
                .addNewPhoto(photoAvatarPath.toString())
                .checkAddingPhoto());
    }
}
