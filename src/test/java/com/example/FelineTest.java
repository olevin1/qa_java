package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FelineTest {
    public static final int EXPECTED_GET_COUNT_KITTENS = 5;
    public static final int COUNT_KITTENS = 5;

    @Test
    public void eatMeatTest() throws Exception {
        List<String> expectedEatMeat = List.of("Животные", "Птицы", "Рыба");
        Feline feline = new Feline();
        List<String> actualEatMeat = feline.eatMeat();
        Assert.assertEquals(expectedEatMeat, actualEatMeat);
    }

    @Test
    public void getFamilyTest() {
        String expectedGetFamily = "Кошачьи";
        Feline feline = new Feline();
        String actualGetFamily = feline.getFamily();
        Assert.assertEquals(expectedGetFamily, actualGetFamily);
    }

    @Test
    public void getKittensTest() {
        int expectedGetKittens = 1;
        Feline feline = new Feline();
        int actualGetKittens = feline.getKittens();
        Assert.assertEquals(expectedGetKittens, actualGetKittens);
    }

    @Test
    public void getKittensCountTest() {
        Feline feline = new Feline();
        int actualGetCountKittens = feline.getKittens(COUNT_KITTENS);
        Assert.assertEquals(EXPECTED_GET_COUNT_KITTENS, actualGetCountKittens);
    }

}