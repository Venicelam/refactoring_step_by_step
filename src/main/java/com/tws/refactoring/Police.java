package com.tws.refactoring;

public class Police {
    private int Adult = 18;
    public boolean checkDriver(Driver driver) {

        if(driver.getAge() >= Adult) return true;
        else return false;
    }
}
