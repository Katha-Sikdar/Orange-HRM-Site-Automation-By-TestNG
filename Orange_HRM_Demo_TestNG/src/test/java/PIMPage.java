import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PIMPage {

    @FindBy(className = "oxd-main-menu-item")
    List<WebElement> menuItems;
    @FindBy(className = "oxd-button")
    List<WebElement> button;
    @FindBy(name = "firstName")
    WebElement txtFirstName;
    @FindBy(name = "lastName")
    WebElement txtLastName;
    @FindBy(className = "oxd-switch-input")
    WebElement toggleButton;

    @FindBy(className = ".oxd-input")
    List<WebElement> txtFields;

    public  PIMPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void createUser(String firstName, String lastName, String username, String password){
        menuItems.get(1).click(); //click on PIM Menu
        button.get(2).click(); //click add button
        txtFirstName.sendKeys(firstName);
        txtLastName.sendKeys(lastName);
        toggleButton.click();
        txtFields.get(5).sendKeys(username);//insert user name
        txtFields.get(6).sendKeys(password);//insert password
        txtFields.get(7).sendKeys(password); //insert confirm password
        button.get(1).click(); //click submit button
    }


}
