import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public WebDriver driver;
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    @FindBy(xpath = "//input[@name=\"email\"]")
    private WebElement loginField;

    @FindBy(xpath = "//input[@name=\"password\"]")
    private WebElement passwdField;

    @FindBy(xpath = "//button[@name=\"submit-button\"]")
    private WebElement loginBtn;

    public void inputLogin(String login) {
        loginField.sendKeys(login); }

    public void inputPasswd(String passwd) {
        passwdField.sendKeys(passwd); }

    public void clickLoginBtn() {
        loginBtn.click();
    }
}