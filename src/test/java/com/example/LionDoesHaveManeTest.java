package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(Parameterized.class)
public class LionDoesHaveManeTest {
    private final String sexLion;
    private final boolean result;

    @Mock
    Feline feline;

    public LionDoesHaveManeTest(String sexLion, boolean result) {
        this.sexLion = sexLion;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void doesHaveManeTest() throws Exception {
        Lion lion = new Lion(sexLion, feline);
        boolean hasMane = lion.doesHaveMane();
        Assert.assertEquals(result, hasMane);
    }
}
