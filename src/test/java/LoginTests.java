import Base.BaseTest;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.MainPage;
import org.junit.*;


public class LoginTests extends BaseTest
{
    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();
    HomePage homePage = new HomePage();



    @Test
    public void FailUserTEST(){

        loginPage
                .fillUsername("TEST QA")
                .fillPassword("test")
                .clickLogin();

        mainPage
                .errorMessageControl(errorMessage1);
    }

    @Test
    public void FailPasswordTEST(){

      loginPage
              .fillUsername("TEST QA")
              .clickLogin();
      mainPage
              .errorMessageControl2(errorMessage2);
    }

    @Test
    public void NoneDataTEST(){

        loginPage
                .fillUsername("")
                .fillPassword("")
                .clickLogin();
        mainPage
                .errorMessageControl2(errorMessage2);
    }

    @Test
    public void MinimumCharTEST(){

        loginPage
                .fillUsername("1")
                .fillPassword("1")
                .clickLogin();
       mainPage
               .errorMessageControl2(errorMessage1);
    }

    @Test
    public void MaxCharTEST(){

        loginPage
                .fillUsername("2319823918892389821892189983218321213892323198239188923898218921899832183212138923231982391889238982189218998321832121389232319823918892389821892189983218321213892323198239188923898218921899832183212138923")
                .fillPassword("23198239188923898218921899832183212138923231982391889238982189218998321832121389232319823918892389821892189983218321213892323198239188923898218921899832183212138923231982391889238982189218998321832121389232319823918892389821892189983218321213892323198239188923898218921899832183212138923")
                .clickLogin();
        mainPage
                .errorMessageControl2(errorMessage1);
    }

    @Test
    public void SuccessTEST(){

        loginPage
                .fillUsername(username)
                .fillPassword(password)
                .clickLogin();
        homePage
                .pageControl("Account Overview");
    }


}
