package pageObjects;

 

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

 

public class AccountRegistrationPage extends BasePage {

               public WebDriverWait wait;

 

               public AccountRegistrationPage(WebDriver driver, WebDriverWait wait) {

                              super(driver, wait);

                              this.wait = wait;

               }

 

               // Elements

                              @FindBy(name = "firstname")

                              WebElement txtFirstname;

 

                              @FindBy(name = "lastname")

                              WebElement txtLasttname;

 

                              @FindBy(name = "email")

                              WebElement txtEmail;

 

                              @FindBy(name = "telephone")

                              WebElement txtTelephone;

 

                              @FindBy(name = "password")

                              WebElement txtPassword;

 

                              @FindBy(name = "confirm")

                              WebElement txtConfirmPassword;

 

                              @FindBy(name = "agree")

                              WebElement chkdPolicy;

 

                              @FindBy(xpath = "//input[@value='Continue']")

                              WebElement btnContinue;

 

                              @FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")

                              WebElement msgConfirmation;

 

                              public void setFirstName(String fname) {

                                             wait.until(ExpectedConditions.visibilityOf(txtFirstname)).sendKeys(fname);

 

                              }

 

                              public void setLastName(String lname) {

                                             wait.until(ExpectedConditions.visibilityOf(txtLasttname)).sendKeys(lname);

 

                              }

 

                              public void setEmail(String email) {

                                             wait.until(ExpectedConditions.visibilityOf(txtEmail)).sendKeys(email);

                              }

 

                              public void setTelephone(String tel) {

                                             wait.until(ExpectedConditions.visibilityOf(txtTelephone)).sendKeys(tel);

 

                              }

 

                              public void setPassword(String pwd) {

                                             wait.until(ExpectedConditions.visibilityOf(txtPassword)).sendKeys(pwd);

 

                              }

 

                              public void setConfirmPassword(String pwd) {

                                             wait.until(ExpectedConditions.visibilityOf(txtConfirmPassword)).sendKeys(pwd);

 

                              }

 

                              public void setPrivacyPolicy() {

                                             wait.until(ExpectedConditions.visibilityOf(chkdPolicy)).click();

                              }

 

                              public void clickContinue() {

                                             //sol1

                                             wait.until(ExpectedConditions.visibilityOf(btnContinue)).click();

                                            

                                             //sol2

                                             //btnContinue.submit();

                                            

                                             //sol3

                                             //Actions act=new Actions(driver);

                                             //act.moveToElement(btnContinue).click().perform();

                                                                                         

                                             //sol4

                                             //JavascriptExecutor js=(JavascriptExecutor)driver;

                                             //js.executeScript("arguments[0].click();", btnContinue);

                                            

                                             //Sol 5

                                             //btnContinue.sendKeys(Keys.RETURN);

                                            

                                             //Sol6 

                                             //WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));

                                             //mywait.until(ExpectedConditions.elementToBeClickable(btnContinue)).click();

                                            

                              }

 

                              public String getConfirmationMsg() {

                                             try {

                                                            return (msgConfirmation.getText());

                                             } catch (Exception e) {

                                                            return (e.getMessage());

 

                                             }

 

                              }

}