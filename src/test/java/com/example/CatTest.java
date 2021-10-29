package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    private Feline mokFeline;


    @Test
    public void getSoundReturnSoundCatTest() {
        Cat cat = new Cat(mokFeline);
        String expected = "Мяу";
        assertEquals(expected, cat.getSound());

    }

    @Test
    public void getFoodReturnFoodForCatTest() throws Exception {
        Cat cat = new Cat(mokFeline);
        List<String> expectedListFood = List.of("Животные", "Птицы", "Рыба");
        when(mokFeline.eatMeat()).thenReturn(expectedListFood);
        assertEquals(expectedListFood, cat.getFood());
    }
}