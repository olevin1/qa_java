package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;

    @Test
    public void catGetSoundTest() {
        String expectedCatSound = "Мяу";
        Cat cat = new Cat(feline);
        String actualCatSound = cat.getSound();
        Assert.assertEquals(expectedCatSound, actualCatSound);
    }

    @Test
    public void catGetFoodTest() throws Exception {
        Cat cat = new Cat(feline);
        List<String> expectedCatFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(expectedCatFood);
        List<String> actualCatFood = cat.getFood();
        Assert.assertEquals(expectedCatFood, actualCatFood);
    }
}