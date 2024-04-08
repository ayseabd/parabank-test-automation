package Pages;

import Base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class LoginPage extends BaseTest {

    By txtUsername = By.name("username");
    By txtPassword = By.name("password");

    By btnRegister = By.cssSelector("[href*='register.htm']");

    By btnLogin = By.cssSelector("[value='Log In']");

    @Step("Kullanıcı Adı Doldurulur: {text}")
    public LoginPage fillUsername(String text){
        driver.findElement(txtUsername).sendKeys(text);

        return this;
    }

    @Step("Parola Adı Doldurulur: {text}")
    public LoginPage fillPassword(String text){
        driver.findElement(txtPassword).sendKeys(text);
        return this;
    }

    @Step("Login Butonuna Tıklanır")
    public LoginPage clickLogin(){
        driver.findElement(btnLogin).click();
        return this;
    }

    @Step("Register Butonuna Tıklanır")
    public LoginPage clickRegister(){
        driver.findElement(btnRegister).click();
        return this;
    }
}
