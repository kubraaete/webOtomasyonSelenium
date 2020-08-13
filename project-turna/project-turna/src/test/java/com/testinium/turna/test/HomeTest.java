package com.testinium.turna.test;

import com.testinium.turna.base.BaseTest;
import com.testinium.turna.page.HomePage;
import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

public class HomeTest extends BaseTest {
    HomePage homePage;

    @Before
    public void setUpK() throws InterruptedException {
        homePage=new HomePage(getDriver());

        getDriver().navigate().to("https://www.turna.com");
        TimeUnit.SECONDS.sleep(5);

    }

    @Test
    public void selectButtonTest() throws InterruptedException{
        TimeUnit.SECONDS.sleep(5);

        homePage.selectButton();
        TimeUnit.SECONDS.sleep(5);

    }

    @Test
    public void currentLocationTest() throws InterruptedException{
        homePage.currentLocation();
        TimeUnit.SECONDS.sleep(5);

    }

    @Test
    public void whereLocationTest() throws InterruptedException{
        homePage.whereLocation();
        TimeUnit.SECONDS.sleep(5);
    }

    @Test
    public void departureCalendarTest() throws InterruptedException{
        TimeUnit.SECONDS.sleep(5);

        homePage.departureCalendar();
        TimeUnit.SECONDS.sleep(5);

    }

    @Test
    public void destinationCalendarTest() throws InterruptedException{
        TimeUnit.SECONDS.sleep(2);

        homePage.destinationCalendar();
        TimeUnit.SECONDS.sleep(5);

    }

    @Test
    public void searchTest() throws InterruptedException{
        TimeUnit.SECONDS.sleep(3);

        homePage.search();
        TimeUnit.SECONDS.sleep(3);



    }

}
