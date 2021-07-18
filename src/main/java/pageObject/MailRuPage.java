package pageObject;

import core.SuperClass;
import io.qameta.allure.Step;

public class MailRuPage extends SuperClass {

    public static final String URL = "https://mail.ru/";
    public static final String EMAIL = "vlasvlasov1985";
    public static final String PASSWORD = "russia1985";
    public static final String LOGIN_FIELD_XPATH = "//input[@class='email-input svelte-1eyrl7y']";
    public static final String PASSWORD_FIELD_XPATH = "//input[@class='password-input svelte-1eyrl7y']";
    public static final String CONFIRM_EMAIL_BUTTON_XPATH = "//button[@class='button svelte-1eyrl7y']";
    public static final String LOGIN_BUTTON_XPATH = "//button[@class='second-button svelte-1eyrl7y']";

    @Step("Get to mail.ru")
    public void getBrowser() {
        actionsOnThePage.getBrowser(URL);
    }

    @Step("Login to your acount")
    public void logInToPersonalAcount() {
        actionsOnThePage.waitElementAndSendKeys(LOGIN_FIELD_XPATH, EMAIL);
        actionsOnThePage.waitElementAndClick(CONFIRM_EMAIL_BUTTON_XPATH);
        actionsOnThePage.waitElementAndSendKeys(PASSWORD_FIELD_XPATH, PASSWORD);
        actionsOnThePage.waitElementAndClick(LOGIN_BUTTON_XPATH);
    }
}