package com.example;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class AlexTest {

    @Mock
    private Feline mokFeline;

    @Test
    public void getKittensShouldReturnKittensAlexTest() throws Exception {
        Alex alex = new Alex();
        alex.setFeline(mokFeline);
        int expected = 0;
        when(mokFeline.getKittens(0)).thenReturn(0);
        assertEquals(expected, alex.getKittens());
    }

    @Test
    public void getFriendsShouldReturnListFriendsAlexTest() throws Exception {
        Alex alex = new Alex();
        List<String> expected = List.of("Марти", "Глория", "Мелман");
        assertEquals(expected, alex.getFriends());


    }

    @Test
    public void getPlaceOfLivingReturnPlaceOfLivingAlexTest() throws Exception {
        Alex alex = new Alex();
        String expected = "Нью-Йоркский Зоопарк";
        assertEquals(expected, alex.getPlaceOfLiving());
    }
}