package com.tweef.chapter01;

import org.junit.Assert;
import org.junit.Test;

public class isUniqueTest {

    private final String PALABRA1 = "abcde";        // unique
    private final String PALABRA2 = "palabra";      // no unique
    private final String PALABRA3 = "foco";         // no unique
    private final String PALABRA4 = "hospital";     // unique
    private final String PALABRA5 = "ema";          // unique
    private final String PALABRA6 = "palindromo";   // no unique
    private final String PALABRA7 = "submarino";    // unique
    private final String PALABRA8 = "auditores";    // unique

    @Test
    public void testIsUnique() {
        var uniqueObject = new isUnique();
        Assert.assertTrue(uniqueObject.getIsUnique(PALABRA1));
        Assert.assertTrue(uniqueObject.getIsUnique(PALABRA4));
        Assert.assertTrue(uniqueObject.getIsUnique(PALABRA5));
        Assert.assertTrue(uniqueObject.getIsUnique(PALABRA7));
        Assert.assertTrue(uniqueObject.getIsUnique(PALABRA8));

        Assert.assertFalse(uniqueObject.getIsUnique(PALABRA2));
        Assert.assertFalse(uniqueObject.getIsUnique(PALABRA3));
        Assert.assertFalse(uniqueObject.getIsUnique(PALABRA6));
    }
}