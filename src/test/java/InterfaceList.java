import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InterfaceList {

    public WebDriver webDriver;

    public InterfaceList(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
        this.webDriver = webDriver;
    }

    @FindBy(xpath = "//input[@aria-label=\"Search\"]")
    private WebElement searchElement;

    @FindBy(xpath = "//a[text()='Log in']")
    private WebElement logInButton;

    @FindBy(xpath = "//a[text()='log out']")
    private WebElement logOutButton;

    @FindBy(xpath = "//a[@aria-label=\"Site switcher\"]")
    private WebElement siteSwitcherButton;

    @FindBy(xpath = "//a[@class=\"s-topbar--item s-user-card s-user-card__small m0 px12 js-gps-track\"]")
    private WebElement toProfile;

    @FindBy(xpath = "//div[@class=\"flex--item mb12 fs-headline2 lh-xs\"]")
    private WebElement uName;

    public void goToProfile() {
        toProfile.click();
    }

    public String getUserName() {
        return uName.getText();
    }

    public void inputQuestion(String q) {
        searchElement.sendKeys(q);
    }

    public void searchQuestion() {
        searchElement.sendKeys(Keys.ENTER);
    }

    public void logOut() {
        logInButton.click();
    }

    public void switchSite() {
        siteSwitcherButton.click();
    }

    public void goLogin() {
        logInButton.click();
    }
}
