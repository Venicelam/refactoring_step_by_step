package com.tws.refactoring;

public class Police {
    private int Adult = 18;
    public boolean checkIfDriverIsAdult(Driver driver) {

        if(driver.getAge() >= Adult) return true;
        else return false;
    }
}
