package pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class JiraBrowsePage {
    WebDriver driver;

    WebDriverWait wait;

    @FindBy(id = "project-name-val")
    WebElement projectName;

    @FindBy(id = "key-val")
    WebElement issueIdentifier;

    @FindBy(id = "summary-val")
    WebElement issueSummaryValue;

    @FindBy(id = "opsbar-operations_more")
    WebElement moreMenuButtonIssue;

    @FindBy(xpath = "//*[@id=\"delete-issue\"]/a")
    WebElement deleteOption;

    @FindBy(name = "Delete")
    WebElement deleteButtonConfirmationPopUp;

    @FindBy(id = "delete-issue-cancel")
    WebElement cancelButtonConfirmationPopUp;

    @FindBy(id = "create-subtask")
    WebElement createSubtaskOption;

    @FindBy(id = "summary")
    WebElement summaryField;

    @FindBy(css = ".content > .field-group:nth-child(1)")
    WebElement nonInputSurfaceSubtaskWindow;

    @FindBy(id = "create-issue-submit")
    WebElement subtaskCreationSubmit;

    @FindBy(xpath = "//button[contains(text(),'Cancel')]")
    WebElement cancelSubtaskCreation;

    @FindBy(id = "edit-issue")
    WebElement editIssueButton;

    @FindBy(id = "edit-issue-submit")
    WebElement editIssueSubmit;

    public JiraBrowsePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void waitUntilDeleteButtonConfirmationPopUpClickable() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("Delete")));
    }

    public String getProjectName() {
        return projectName.getText();
    }

    public String getIssueIdentifier() {
        return issueIdentifier.getText();
    }

    public String getIssueSummaryValue() {
        return issueSummaryValue.getText();
    }

    public void clickOnMoreMenuButtonIssue() {
        moreMenuButtonIssue.click();
    }

    public void clickOnDeleteOption() {
        deleteOption.click();
    }

    public void clickOnDeleteButtonConfirmationPopUp() {
        deleteButtonConfirmationPopUp.click();
    }

    public void clickOnCancelButtonConfirmationPopUp() {
        cancelButtonConfirmationPopUp.click();
    }

    public Boolean isDisplayedCreateSubtask() {
        return createSubtaskOption.isDisplayed();
    }

    public void clickOnCreateSubtaskOption() {
        createSubtaskOption.click();
    }

    public void clickOnSummaryField() {
        summaryField.click();
    }

    public void setSummaryFieldContent(String content) {
        summaryField.sendKeys(content);
    }

    public String getSummaryFieldContent() {
        return summaryField.getText();
    }

    public void clickOutOfField() {
        nonInputSurfaceSubtaskWindow.click();
    }

    public void clickOnSubtaskCreationSubmit() {
        subtaskCreationSubmit.click();
    }

    public void clickOnCancelSubtaskCreation() {
        cancelSubtaskCreation.click();
    }

    public void clickOnEditIssueButton() {
        editIssueButton.click();
    }

    public Boolean isDisplayedEditIssueButton() {
        return editIssueButton.isDisplayed();
    }

    public void clickOnEditIssueSubmit() {
        editIssueSubmit.click();
    }

    public Boolean isDisplayedEditIssueSubmit() {
        return editIssueSubmit.isDisplayed();
    }

}
