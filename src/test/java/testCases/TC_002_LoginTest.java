package testCases;

 

import org.testng.Assert;

import org.testng.annotations.Test;

 

import pageObjects.HomePage;

import pageObjects.LoginPage;

import pageObjects.MyAccountPage;

import testBase.BaseClass;

 

public class TC_002_LoginTest extends BaseClass

{

               @Test

               public void test_Login()

               {

                              logger.info("Starting TC_002_LoginTest");

                             

                              try

                              {                                                          

                                             HomePage hp=new HomePage(driver, wait);

                                            

                                             hp.clickMyAccount();

                                                                                         

                                             hp.clickLogin();

                                            

                                             LoginPage lp=new LoginPage(driver, wait);

                                            

                                             lp.setEmail(rb.getString("email")); // valid email, get it from properties file

                                            

                                             lp.setPassword(rb.getString("password")); // valid password, get it from properties file

                                            

                                             lp.clickLogin();

                                            

                                             MyAccountPage macc=new MyAccountPage(driver, wait);

                                            

                                             boolean targetpage=macc.isMyAccountPageExists();

                                                                                         

                                             Assert.assertEquals(targetpage, true);

                                            

                              }             

                              catch(Exception e)

                              {

                                             Assert.fail();

                              }

                              logger.info(" Finished TC_002_LoginTest");

                             

               }

              

              

}

 

 