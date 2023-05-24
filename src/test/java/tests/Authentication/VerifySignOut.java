package tests.Authentication;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;
import utils.ConfigProvider;

public class VerifySignOut extends BaseTest {

    @Description("User sign out")
    @Test
    public void verifySignOut() {
        headerNavigationBar.clickOnAccountListLink();
        signInPage.enterEmail(ConfigProvider.EMAIL1);
        signInPage.clickOnContinueButton();
        signInPage.enterPassword(ConfigProvider.PASSWORD);
        signInPage.clickOnSignInButton();
        headerNavigationBar.hoverMouseOnSignInLink();
        accountListFlyout.clickOnSignOutLink();
        Assert.assertEquals(signInPage.getPageTitle(), ConfigProvider.SIGN_IN_PAGE_TITLE, "Page title does not match");
    }
}
