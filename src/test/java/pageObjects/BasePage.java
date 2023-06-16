package pageObjects;

 

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.WebDriverWait;

 

public class BasePage {

 

               WebDriver driver;

                  

                  public BasePage(WebDriver driver, WebDriverWait wait)

                    {

                                   this.driver=driver;

                                   PageFactory.initElements(driver,this);

                    }

                                 

}

 