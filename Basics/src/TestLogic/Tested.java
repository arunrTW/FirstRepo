package TestLogic;


import org.junit.Test;

import static org.junit.Assert.*;

import Logic.Logic;

public class Tested {
    @Test
    public void test_JUnit() {
        Logic logic = new Logic();
        assertEquals(logic.totalTimeInMinutes(3,20), 26);
    }

    @Test
    public void failure_Test() {
        Logic logic = new Logic();
        assertNotEquals(logic.totalTimeInMinutes(3,20), 16);
    }
}

