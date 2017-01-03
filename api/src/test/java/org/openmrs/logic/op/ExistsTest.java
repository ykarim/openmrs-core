package org.openmrs.logic.op;

import org.junit.Assert;
import org.junit.Test;

/**
 * Tests the {@link Exists} class
 */
public class ExistsTest {

    /**
     * @verifies return string
     * @see Exists#toString()
     */
    @Test
    public void toString_shouldReturnString() {
        Exists exists = new Exists();
        final String existsString = "EXISTS";
        Assert.assertEquals(existsString, exists.toString());
    }
}
