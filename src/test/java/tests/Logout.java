package tests;

import org.testng.annotations.Test;
import pages.RigesterUserPage;
import pages.SignUpPage;

public class Logout extends BaseTest{

    @Test
    public void logOutUser(){
        RigesterUserPage rigesterUserPage = new RigesterUserPage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);
        rigesterUserPage.VerifyHomePageVisiblity();
        rigesterUserPage.clickOnSignupLoginButton();
        rigesterUserPage.verifyLoginToYourAccountIsVisible();
        rigesterUserPage.enterEmailLogin("yomnanasr@gmail.com");
        rigesterUserPage.enterPasswordLogin("test123");
        rigesterUserPage.clickOnLoginButton();
        signUpPage.VerifyThatLoggedInAsusernameIsVisible();
        rigesterUserPage.clickOnLogoutButton();
        rigesterUserPage.verifyThatuserIsNavigatedToLoginPage();




    }
}
