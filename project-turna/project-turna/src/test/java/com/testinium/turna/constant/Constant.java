package com.testinium.turna.constant;

import org.openqa.selenium.By;

public class Constant {

    public static final String CURRENT_LOCATION_TEXT= "İSTANBUL";
    public static final String WHERE_LOCATION_TEXT= "ANKARA";

    public static final By ROUND_TRIP= By.id("lb-way");
    public static final By CURRENT_LOCATION= By.cssSelector("input[name='flight_origin']");
    public static final By WHERE=By.name("flight_destination");

}
