package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)

public class LionDoesHaveManeNegativeTest {

    @Mock
    Feline feline;

    @Test
    public void lionDoesHaveManeNegativeTest() throws Exception {
        Assert.assertThrows(Exception.class, () -> new Lion("Середний пол", feline));
    }
}