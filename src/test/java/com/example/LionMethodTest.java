package com.example;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class LionMethodTest {

    @Mock
    Feline mockfeline;

    @Test
    public void getKittensReturnKittensLionTest() throws Exception {
        Lion lion = new Lion("Самец");
        lion.setFeline(mockfeline);
        when(mockfeline.getKittens()).thenReturn(1);
        int expected = 1;
        assertEquals(expected, lion.getKittens());
    }

    @Test
    public void getFoodReturnFoodLionTest() throws Exception {
        Lion lion = new Lion("Самец");
        lion.setFeline(mockfeline);
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        when(mockfeline.getFood("Хищник")).thenReturn(expected);
        assertEquals(expected, lion.getFood());
    }
}
