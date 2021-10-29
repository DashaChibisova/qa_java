package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(Parameterized.class)
public class AnimalTest {

    private final String animalKind;
    private final List<String> expected;
    Animal animal = new Animal();

    public AnimalTest(String animalKind, List<String> expected) {
        this.animalKind = animalKind;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[] getSexData() {
        return new Object[][]{
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")}
        };
    }

    @Test
    public void getFoodReturnFoodAnimalTest() throws Exception {
        assertEquals(expected, animal.getFood(animalKind));

    }

    @Test
    public void ifIntroduceIncorrectAnimalKindShouldBeExceptionTest() {
        String animalKind = "оно";
        Throwable exception = assertThrows(Exception.class, () -> animal.getFood(animalKind));
        String expectedMessage = "Неизвестный вид животного, используйте значение Травоядное или Хищник";
        assertEquals(expectedMessage, exception.getMessage());
    }


    @Test
    public void getFamilyReturnFamilyAnimalTest() {
        String expected = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        assertEquals(expected, animal.getFamily());
    }
}