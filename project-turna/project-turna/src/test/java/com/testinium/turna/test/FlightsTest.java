package com.testinium.turna.test;

import com.testinium.turna.base.BaseTest;
import com.testinium.turna.page.FlightsPage;
import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

public class FlightsTest extends BaseTest {
    FlightsPage flightsPage;

    @Before
    public void setUpFlights(){
        flightsPage=new FlightsPage(getDriver());

        getDriver().navigate().to("https://www.turna.com/ucak-bileti/istanbul-ankara-esenboga-havalimani/2020-08-15/2020-08-29");

    }
    @Test
    public void selectFlightsCurrentLocation() throws InterruptedException{
        TimeUnit.SECONDS.sleep(3);

        flightsPage.selectFlightsCurrentLocation();
        TimeUnit.SECONDS.sleep(3);

    }

    @Test
    public void selectFlightsWhereLocation() throws InterruptedException{
        TimeUnit.SECONDS.sleep(3);

        flightsPage.selectFlightsWhereLocation();
        TimeUnit.SECONDS.sleep(5);

    }

    @Test
    public void containeTest() throws InterruptedException{
        TimeUnit.SECONDS.sleep(3);

        flightsPage.selectFlightsCurrentLocation();

        TimeUnit.SECONDS.sleep(3);


        flightsPage.selectFlightsWhereLocation();
        TimeUnit.SECONDS.sleep(3);

        flightsPage.containe();
        TimeUnit.SECONDS.sleep(10);

        flightsPage.passengerInformation();
        TimeUnit.SECONDS.sleep(10);

        flightsPage.selectBirth();
        TimeUnit.SECONDS.sleep(5);

        flightsPage.contactInformation();
        TimeUnit.SECONDS.sleep(3);






    }


}
