package com.testinium.turna.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BasePage {
    WebDriver driver;
    WebDriverWait wait;

    public BasePage(WebDriver driver){
        this.driver=driver;
        wait=new WebDriverWait(driver, 20);
    }

    public WebElement findElement(By by){
        untilElementAppear(by);
        return driver.findElement(by);
    }

    public List<WebElement> findElements(By by){
        untilElementAppear(by);
        return driver.findElements(by);
    }

    public void clickElement(By by){
        untilElementClickable(by);
        findElement(by).click();
    }

    public WebElement sendKeys(By by, String text){
        findElement(by).sendKeys(text);
        return null;
    }
    public void selectOptionByValue(By by, String value) {
        Select select = new Select(findElement(by));
        select.selectByValue(value);
    }

    public void untilElementAppear(By by){
        System.out.println("Elementin var olması bekleniyor!");
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public void untilElementClickable(By by){
        System.out.println("Elementin tıklanabilir olması bekleniyor!");
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

}
