package pageObject;

import core.ActionsOnThePage;
import core.SuperClass;
import io.qameta.allure.Step;

public class MailAccountPage extends SuperClass {

    public static final String NEW_EMAIL_BUTTON_XPATH = "//span[@class='compose-button__txt']";

    @Step("Click to create new Email")
    public void createNewEmail() {
        actionsOnThePage.waitUntilPageLoaded(NEW_EMAIL_BUTTON_XPATH);
        actionsOnThePage.waitElementAndClick(NEW_EMAIL_BUTTON_XPATH);
    }
}
