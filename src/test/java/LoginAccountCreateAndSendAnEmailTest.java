import core.SuperClass;
import org.junit.Test;

public class LoginAccountCreateAndSendAnEmailTest extends SuperClass {

    @Test
    public void logInToMailRuAndSendAnEmail() {
        mailRuPage.getBrowser();
        mailRuPage.logInToPersonalAcount();

        mailAccountPage.createNewEmail();

        newEmailPage.writeAnEmailAndSend();
       }
}
