import Base.BaseTest;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.RegisterPage;
import org.testng.annotations.Test;

public class RegisterTests extends BaseTest {

    LoginPage loginPage = new LoginPage();
    RegisterPage registerPage = new RegisterPage();

    HomePage homePage = new HomePage();


    @Test (description = "Kullanıcı Oluşturma Testi")
    public void userCreate(){
        String username="testqa"+createRandomNumber(100000);

    loginPage
            .clickRegister();

    registerPage
            .fillFirstName("TEST QA")
            .fillLastName("QA TEST")
            .fillAddress("Deneme mah.")
            .fillCity("ISTANBUL")
            .fillState("DENEME")
            .fillZipCode("34000")
            .fillPhoneNumber("534534534")
            .fillSSN("123123123")
            .fillUsername(username)
            .fillPassword("qa123")
            .fillRepeatedPassword("qa123")
            .clickRegister();

    homePage
            .usernameControl("Welcome " +username);

    }

    @Test (description = "Geçersiz Kullanıcı Adı Testi")
    public void userNameNotValid(){

        String username="testqa123456";

        loginPage
                .clickRegister();

        registerPage
                .fillFirstName("TEST QA")
                .fillLastName("QA TEST")
                .fillAddress("Deneme mah.")
                .fillCity("ISTANBUL")
                .fillState("DENEME")
                .fillZipCode("34000")
                .fillPhoneNumber("534534534")
                .fillSSN("123123123")
                .fillUsername(username)
                .fillPassword("qa123")
                .fillRepeatedPassword("qa123")
                .clickRegister()
                .userNameErrorMessageControl();

    }

}
