package com.testinium.turna.page;

import com.testinium.turna.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.testinium.turna.constant.Constant.*;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void selectButton() {
        clickElement(ROUND_TRIP);
    }

    public void currentLocation() {
        sendKeys(CURRENT_LOCATION, CURRENT_LOCATION_TEXT);
    }

    public void whereLocation() {
        sendKeys(WHERE, WHERE_LOCATION_TEXT);
    }

    public void departureCalendar() {
        clickElement(By.cssSelector("input[name='fromdate']"));
        List<WebElement> allDates = findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
        for (WebElement element : allDates) {

            String date = element.getText();

            if (date.equalsIgnoreCase("15")) {
                element.click();
                break;
            }

        }
    }

    public void destinationCalendar() {
        clickElement(By.cssSelector("div[class='search-form-item calendar return  datepicker-wrapper dtp-wrap-to']"));
        List<WebElement> allDates=findElements(By.xpath("//*[@id='ui-datepicker-div']/div[2]//td"));
        for(WebElement element:allDates)
        {

            String date=element.getText();

            if(date.equalsIgnoreCase("29"))
            {
                element.click();
                break;
            }

        }

    }

    public void search(){
        clickElement(By.cssSelector("div[id='btnSearch']"));
    }

}
