package test;

import io.qameta.allure.Allure;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static test.AbstractTest.driver;

public class TestListener implements TestWatcher {
    @Override
    public void testFailed(ExtensionContext context, Throwable cause) {
        Allure.getLifecycle().addAttachment("ScreenShot", "image/png", "png", ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES));
        driver.close();
        driver.quit();
    }

    @Override
    public void testSuccessful(ExtensionContext context) {
        Allure.getLifecycle().addAttachment("ScreenShot", "image/png", "png", ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES));
        driver.close();
        driver.quit();
    }
}
