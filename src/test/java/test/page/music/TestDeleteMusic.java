package test.page.music;

import java.util.List;

import io.qameta.allure.Description;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import data.music.Music;
import page.music.MusicPage;
import test.AbstractTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestDeleteMusic extends AbstractTest {
    @BeforeEach
    public void login() {
        mainPage = loginPage.doLogin(user);
    }

    @Description("Тест на удаление песен, которые были переданы")
    @Test
    public void deleteSongs() {
        MusicPage musicPage = mainPage.openMusicOnMainPage();
        List<Music> musicList = musicPage.addTreeSongs();
        assertTrue(musicList.containsAll(musicPage.clickMyMusic().deleteSongsFromList(musicList)));
    }
}
