package core;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ActionsOnThePage extends SuperClass {

    public static void getBrowser(String URL) {
        driver.get(URL);
    }

    public static void waitElementAndSendKeys(String xpath, String text) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath))).sendKeys(text);
    }

    public static void waitElementAndClick(String xpath) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath))).click();
    }

    public static void waitUntilPageLoaded(String xpath){
        WebDriverWait pageLoading = new WebDriverWait(driver, 30);
        pageLoading.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpath)));
    }
}




