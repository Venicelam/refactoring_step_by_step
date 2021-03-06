package com.tws.refactoring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class PoliceTest {
    @Test
    void should_driver_can_drive_a_car(){
        //given Driver
        Driver driverA = new Driver(18);
        Driver driverB = new Driver(5);
        //when
        //then checkDriver return true

        assertTrue(new Police().checkIfDriverIsAdult(driverA));
        assertFalse(new Police().checkIfDriverIsAdult(driverB));

        // assertTrue(new Police().checkIfDriverIsAdult(new Driver(18));
    }

}
