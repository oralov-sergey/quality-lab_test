package pageObject;

import core.ActionsOnThePage;
import core.SuperClass;
import io.qameta.allure.Step;

public class NewEmailPage extends SuperClass {

    public static final String CONTACT_FIELD_XPATH = "//input[@class='container--H9L5q size_s--3_M-_']";
    public static final String TEXT_FIELD_XPATH = "/html/body/div[15]/div[2]/div/div[1]/div[2]/div[3]/div[5]/div/div/div[2]/div[1]/div[1]";
    public static final String CONTACT = "ivanivan1985ivanov@mail.ru";
    public static final String TEXT_FOR_EMAIL = "Лаборатория Качества";
    public static final String SEND_BUTTON_XPATH = "(//span[@class='button2__txt'])[4]";

    @Step("Write and send an Email")
    public void writeAnEmailAndSend(){
        actionsOnThePage.waitElementAndSendKeys(CONTACT_FIELD_XPATH, CONTACT);
        actionsOnThePage.waitElementAndSendKeys(TEXT_FIELD_XPATH, TEXT_FOR_EMAIL);
        actionsOnThePage.waitElementAndClick(SEND_BUTTON_XPATH);
    }

}
