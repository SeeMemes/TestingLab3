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

    @FindBy(xpath = "//input[@aria-label='Search']")
    private WebElement searchElement;

    public void inputQuestion(String q) {
        searchElement.clear();
        searchElement.sendKeys(q);
    }

    public void searchQuestion() {
        searchElement.sendKeys(Keys.ENTER);
    }

    public void questionMenu() {
        searchElement.click();
    }

    @FindBy(xpath = "//a[text()='Log in']")
    private WebElement logInButton;

    public void goLogin() {
        logInButton.click();
    }

    public WebElement getLogInButton() {
        return logInButton;
    }

    @FindBy(xpath = "//a[@href='https://stackoverflow.com/users/logout' and @class='js-gps-track']")
    private WebElement logOutButton;

    public void logOut() {
        logOutButton.click();
    }

    @FindBy(xpath = "//a[@aria-label='Site switcher']")
    private WebElement siteSwitcherButton;

    public void switchSite() {
        siteSwitcherButton.click();
    }

    @FindBy(xpath = "//a[@class='s-topbar--item s-user-card s-user-card__small m0 px12 js-gps-track']")
    private WebElement toProfile;

    public void goToProfile() {
        toProfile.click();
    }

    @FindBy(xpath = "//div[@class='flex--item mb12 fs-headline2 lh-xs']")
    private WebElement uName;

    public String getUserName() {
        return uName.getText();
    }

    @FindBy(xpath = "//button[text() = 'Log out']")
    private WebElement logOutAcceptButton;

    public void logOutAccept() {
        logOutAcceptButton.click();
    }

    @FindBy(xpath = "//h1[text() = 'Search Results']")
    private WebElement searchHeader;

    public WebElement getSearchHeader() {
        return searchHeader;
    }

    @FindBy(xpath = "//div[@class = 'mb8']")
    private WebElement questionResult;

    public String getQuestionResultText() {
        return questionResult.getText();
    }

    @FindBy(xpath = "//a[@href='/questions/ask']")
    private WebElement questionButton;

    public void askQuestion() {
        questionButton.click();
    }

    @FindBy(xpath = "//button[@class='flex--item s-btn s-btn__primary s-btn__icon ws-nowrap js-begin-review-button js-gps-track']")
    private WebElement reviewQuestion;

    public void clickReviewQuestion() {
        reviewQuestion.click();
    }

    @FindBy(xpath = "//div[@class='s-input-message mt4 js-stacks-validation-message' and contains(text(),'Title')]")
    private WebElement headerAllert;

    public String headerAllertMessage() {
        return headerAllert.getText();
    }

    @FindBy(xpath = "//div[@class='s-input-message mt4 js-stacks-validation-message' and contains(text(),'Body')]")
    private WebElement bodyAllert;

    public String bodyAllertMessage() {
        return bodyAllert.getText();
    }

    @FindBy(xpath = "//div[@class=\"s-input-message js-stacks-validation-message\"]")
    private WebElement tagAllert;

    public String tagAllertMessage() {
        return tagAllert.getText();
    }
}
