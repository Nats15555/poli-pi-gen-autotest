package page.friend;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page.LoadableComponent;

public class FriendPage implements LoadableComponent {
    private final WebDriver driver;
    private final By friendName = By.xpath("//*[@id=\"hook_Block_UserProfileInfo\"]/div/a/h1");
    private final By firstFriend = By.xpath("//*[@id=\"hook_Block_MyFriendsSquareCardsPagingB\"]/div/div[2]/div/ul/li/div/div[2]/div[1]/a");

    public FriendPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getFriendName() {
        chekLoadComponent(driver, 5, friendName);
        return driver.findElement(friendName).getText();
    }

    public FriendPage clickOnFirstFriend() {
        chekLoadComponent(driver, 5, firstFriend);
        driver.findElement(firstFriend).click();
        return this;
    }
}
