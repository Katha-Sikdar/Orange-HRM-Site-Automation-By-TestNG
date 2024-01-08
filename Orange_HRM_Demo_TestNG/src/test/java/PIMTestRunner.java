import org.openqa.selenium.By;

public class PIMTestRunner extends Setup {

    public void createUser(){
        PIMPage pimPage=new PIMPage(driver);
        pimPage.createUser(firstName:"User",lastName:"new", username:"NewUser", password:"123456");
        String textActual = driver.findElements(By.className("orangehrm-main-title")).get(0).getText();
    }
}
