package Pages;
import Base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.Assert;

public class HomePage extends BaseTest {

    By objTitle = By.xpath("//*[@id=\"rightPanel\"]/ h1");

    By lblUsername = By.cssSelector("[id ='rightPanel'] h1");

    @Step("Sayfa Kontrolü: {title}")
    public HomePage pageControl(String title){
        String text = driver.findElement(objTitle).getText();

        Assert.assertEquals(title, text);
        return this;
    }

    public HomePage usernameControl(String title){
        String text = driver.findElement(lblUsername).getText();

        Assert.assertEquals(title,text);
        return this;
    }
}
