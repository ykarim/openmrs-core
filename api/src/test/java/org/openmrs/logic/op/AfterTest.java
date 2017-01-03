package org.openmrs.logic.op;

import org.junit.Assert;
import org.junit.Test;

/**
 * Tests the {@link After} class
 */
public class AfterTest {

    /**
     * @verifies return string
     * @see After#toString()
     */
    @Test
    public void toString_shouldReturnString() throws Exception {
        After after = new After();
        final String afterString = "AFTER";
        Assert.assertEquals(afterString, after.toString());
    }
}
