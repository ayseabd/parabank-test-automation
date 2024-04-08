package Pages;
import Base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterPage extends BaseTest {
    By txtFirstName = By.id("customer.firstName");
    By txtLastName = By.id("customer.lastName");
    By txtAddress = By.id("customer.address.street");
    By txtCity = By.id("customer.address.city");

    By txtState = By.id("customer.address.state");
    By txtZipCode = By.id("customer.address.zipCode");
    By txtPhoneNumber = By.id("customer.phoneNumber");
    By txtSSN = By.id("customer.ssn");
    By txtUsername = By.id("customer.username");
    By lblErrorUsername = By.id("customer.username.errors");
    By txtPassword = By.id("customer.password");
    By txtRepeatedPassword = By.id("repeatedPassword");

    By btnRegister = By.cssSelector("[value='Register']");


    @Step("First Name Doldurulur {text}")
    public RegisterPage fillFirstName(String text){
        driver.findElement(txtFirstName).sendKeys(text);
        return this;
    }

    @Step("Last Name Name Doldurulur {text}")
    public RegisterPage fillLastName(String text){
        driver.findElement(txtLastName).sendKeys(text);
        return this;
    }

    @Step("Adress Alanı Doldurulur {text}")
    public RegisterPage fillAddress(String text){
        driver.findElement(txtAddress).sendKeys(text);
        return this;
    }

    @Step("Şehir Doldurulur {text}")
    public RegisterPage fillCity(String text){
        driver.findElement(txtCity).sendKeys(text);
        return this;
    }

    @Step("State Doldurulur {text}")
    public RegisterPage fillState(String text){
        driver.findElement(txtState).sendKeys(text);
        return this;
    }
    @Step("Posta Kodu Name Doldurulur {text}")
    public RegisterPage fillZipCode(String text){
        driver.findElement(txtZipCode).sendKeys(text);
        return this;
    }
    @Step("Telefon Numarası Doldurulur {text}")
    public RegisterPage fillPhoneNumber(String text){
        driver.findElement(txtPhoneNumber).sendKeys(text);
        return this;
    }

    @Step("SSN Alanı Doldurulur {text}")
    public RegisterPage fillSSN(String text){
        driver.findElement(txtSSN).sendKeys(text);
        return this;
    }
    @Step("Kullanıcı Adı Doldurulur {text}")
    public RegisterPage fillUsername(String text){
        driver.findElement(txtUsername).sendKeys(text);
        return this;
    }

    @Step("Kullanıcı Adı Hatası Görüntülendi")
    public RegisterPage userNameErrorMessageControl(){
        boolean status = driver.findElement(lblErrorUsername).isDisplayed();
        Assert.assertTrue(status);
        return this;
    }
    @Step("Şifre Doldurulur {text}")
    public RegisterPage fillPassword(String text){
        driver.findElement(txtPassword).sendKeys(text);
        return this;
    }
    @Step("Şifre Tekrarı Doldurulur {text}")
    public RegisterPage fillRepeatedPassword(String text){
        driver.findElement(txtRepeatedPassword).sendKeys(text);
        return this;
    }

    @Step("Register Butonuna Tıklanır")
    public RegisterPage clickRegister(){
        driver.findElement(btnRegister).click();
        return this;
    }





}
