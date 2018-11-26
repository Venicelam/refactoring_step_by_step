package com.tws.refactoring;

public class Police {
    private final static int Adult = 18;
    public boolean checkIfDriverIsAdult(Driver driver) {
            return driver.getAge() >= Adult;

    }
}
