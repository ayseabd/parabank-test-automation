import Base.BaseTest;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.MainPage;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;


@Feature("Login Test Senaryoları")
public class LoginTests extends BaseTest
{
    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();
    HomePage homePage = new HomePage();



    @Test (description = "TC0001")
    public void FailUserTEST(){

        loginPage
                .fillUsername("TEST QA")
                .fillPassword("test")
                .clickLogin();

        mainPage
                .errorMessageControl(errorMessage1);
    }

    @Test (description = "TC0002")
    public void FailPasswordTEST(){

      loginPage
              .fillUsername("TEST QA")
              .clickLogin();
      mainPage
              .errorMessageControl2(errorMessage2);
    }

    @Test (description = "TC0003")
    public void NoneDataTEST(){

        loginPage
                .fillUsername("")
                .fillPassword("")
                .clickLogin();
        mainPage
                .errorMessageControl2(errorMessage2);
    }

    @Test (description = "TC0004")
    public void MinimumCharTEST(){

        loginPage
                .fillUsername("1")
                .fillPassword("1")
                .clickLogin();
       mainPage
               .errorMessageControl2(errorMessage1);
    }

    @Test (description = "TC0005")
    public void MaxCharTEST(){

        loginPage
                .fillUsername("2319823918892389821892189983218321213892323198239188923898218921899832183212138923231982391889238982189218998321832121389232319823918892389821892189983218321213892323198239188923898218921899832183212138923")
                .fillPassword("23198239188923898218921899832183212138923231982391889238982189218998321832121389232319823918892389821892189983218321213892323198239188923898218921899832183212138923231982391889238982189218998321832121389232319823918892389821892189983218321213892323198239188923898218921899832183212138923")
                .clickLogin();
        mainPage
                .errorMessageControl2(errorMessage1);
    }

    @Test (description = "Sisteme Başarılı Giriş Testi")
    public void SuccessTEST(){

        loginPage
                .fillUsername(username)
                .fillPassword(password)
                .clickLogin();
        homePage
                .pageControl("Account Overview");
    }


}
