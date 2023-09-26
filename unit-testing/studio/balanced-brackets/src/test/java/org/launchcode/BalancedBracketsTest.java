package org.launchcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    String str = "[Launch][Code]";

    @Test
    public void emptyTest() { assertEquals(true, true);}

    @Test
    public void onlyBracketsReturnsTrue()  {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
//
    @Test
    public void checkIfNull()   {
        assertNotNull(str);
    }
    @Test
    public void bracketNotMisNested ()  {
        String msg = "test to see if it has a proper closing bracket";
        String testData = str;
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);

        assertTrue(result, msg);
    }
}