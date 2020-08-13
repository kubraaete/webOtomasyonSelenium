package com.testinium.turna.page;

import com.testinium.turna.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class FlightsPage extends BasePage {
    public FlightsPage(WebDriver driver) {
        super(driver);
    }
    public void selectFlightsCurrentLocation() {
        WebElement element=findElement(By.xpath("//*[@id='1018']/div[2]/div[2]/input"));
        element.click();
        //clickElement(By.cssSelector("  li[id='login-link']"));
    }

    public void selectFlightsWhereLocation() {
        WebElement  element=findElement(By.xpath("//*[@id='1092']/div[2]/div[2]/input"));
        element.click();
        //clickElement(By.cssSelector("  li[id='login-link']"));
    }

    public void containe(){
        clickElement(By.cssSelector("button[class='bt-choose']"));
    }

    public void passengerInformation(){
        clickElement(By.cssSelector("#lb-female > span"));
        sendKeys(By.xpath("/html/body/div[1]/div[1]/div[5]/div[2]/div/div[2]/div[3]/div[1]/div[1]/input"), "Kübra");
        sendKeys(By.xpath("/html/body/div[1]/div[1]/div[5]/div[2]/div/div[2]/div[3]/div[1]/div[2]/input"), "ETE");

    }

    public void selectBirth() throws InterruptedException {
        selectOptionByValue(By.cssSelector("select[class='datepicker-select day-select day-of-birth']"), "01");
        TimeUnit.SECONDS.sleep(3);
        selectOptionByValue(By.cssSelector("select[class='datepicker-select month-select month-of-birth']"), "01");
        TimeUnit.SECONDS.sleep(3);
        selectOptionByValue(By.cssSelector("select[class='datepicker-select year-select year-of-birth']"), "1997");
        TimeUnit.SECONDS.sleep(5);
        selectOptionByValue(By.cssSelector("select[class='passenger-nationality']"), "TR");
        TimeUnit.SECONDS.sleep(3);
        sendKeys(By.cssSelector("input[class='citizenno ']"), "11111111111");

        sendKeys(By.cssSelector("input[name='hesCode']"), "11111111111");

        TimeUnit.SECONDS.sleep(3);
    }
    public void contactInformation() throws InterruptedException{
        selectOptionByValue(By.cssSelector("select[id='phoneprefix']"), "+90");
        TimeUnit.SECONDS.sleep(5);
        sendKeys(By.cssSelector("input[id='txtPhone']"), "01111111111");
        TimeUnit.SECONDS.sleep(3);
        sendKeys(By.id("txtEmail"), "kubraete");


    }
}
