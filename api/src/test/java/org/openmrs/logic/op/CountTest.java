package org.openmrs.logic.op;

import org.junit.Assert;

/**
 * Tests the {@link Count} class
 */
public class CountTest {

    /**
     * @verifies return string
     * @see Count#toString()
     */
    public void toString_shouldReturnString() {
        Count count = new Count();
        final String countString = "Count";
        Assert.assertEquals(countString, count.toString());
    }
}
