package com.example;

import org.junit.Test;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {

    Feline feline = new Feline();

    @Test
    public void eatMeatReturnFoodForFelineTest() throws Exception {
        List<String> expectedListFood = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expectedListFood, feline.eatMeat());
    }

    @Test
    public void getFamilyReturnFamilyFelineTest() {
        String expected = "Кошачьи";
        assertEquals(expected, feline.getFamily());
    }

    @Test
    public void getKittensWhisParameterReturnAmountKittensTest() {
        int expected = 3;
        assertEquals(expected, feline.getKittens(3));

    }

    @Test
    public void getKittensReturnOneKittensTest() {
        int expected = 1;
        assertEquals(expected, feline.getKittens());
    }
}