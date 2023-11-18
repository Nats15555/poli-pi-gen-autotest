package page.group;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import page.LoadableComponent;
import page.friend.FriendPage;

public class GroupPage implements LoadableComponent {
    private final WebDriver driver;
    private final By firstGroupButton = By.xpath("//*[@class=\"button-pro group-join_btn __small __sec\"]");
    private final By enteredCorrectly = By.xpath("//span[contains(text(), 'Вы в группе')]");
    private final By beforeName = By.xpath("//*[@id=\"hook_Loader_PopularGroupsListBlockLoader\"]/div[1]/div[1]/div[1]/div[2]/div[1]/a");
    private final By afterName = By.xpath("//*[@id=\"group-main-layer\"]/div[2]/div[1]/div/div/div[1]/div/div/div/div/div/div[2]/a/span");


    public GroupPage(WebDriver driver) {
        this.driver = driver;
    }

    public GroupPage subscribeToGroup() {
        chekLoadComponent(driver, 5, firstGroupButton);
        driver.findElement(firstGroupButton).click();
        return this;
    }

    public boolean checkSubscribeToGroup() {
        chekLoadComponent(driver, 5, enteredCorrectly);
        return driver.findElement(enteredCorrectly).isDisplayed();
    }

    public GroupPage clickOnFirstGroup() {
        chekLoadComponent(driver, 5, beforeName);
        driver.findElement(beforeName).click();
        return this;
    }

    public String getNameBefore() {
        chekLoadComponent(driver, 5, beforeName);
        return driver.findElement(beforeName).getText();
    }

    public String getNameAfter() {
        chekLoadComponent(driver, 5, afterName);
        return driver.findElement(afterName).getText();
    }
}
