import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class InterfaceTest {
    private static InterfaceList interfaceList;
    private static LoginPage loginPage;
    private static FirefoxDriver firefoxDriver;

    @BeforeAll
    static void setup() {
        System.setProperty("webdriver.gecko.driver", ConfProperties.getProperty("driver"));
        firefoxDriver = new FirefoxDriver();
        loginPage = new LoginPage(firefoxDriver);
        interfaceList = new InterfaceList(firefoxDriver);
        firefoxDriver.manage().window().maximize();
        firefoxDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        firefoxDriver.get("http://stackoverflow.com/");
    }

    @Test
    public void loginTest () {
        interfaceList.goLogin();
        loginPage.inputLogin(ConfProperties.getProperty("email"));
        loginPage.inputPasswd(ConfProperties.getProperty("password"));
        loginPage.clickLoginBtn();
        interfaceList.goToProfile();
        Assert.assertEquals(interfaceList.getUserName(), ConfProperties.getProperty("uname"));
    }

    @AfterClass
    public static void tearDown(){
        firefoxDriver.quit();
    }
}
