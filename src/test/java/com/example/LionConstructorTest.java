package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.MockitoAnnotations;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(Parameterized.class)
public class LionConstructorTest {

    private final String sex;
    private final boolean expected;

    public LionConstructorTest(String sex, boolean expected) {
        this.sex = sex;
        this.expected = expected;
    }

    @Before
    public void init() {
        MockitoAnnotations.openMocks(this);
    }

    @Parameterized.Parameters
    public static Object[] getSexData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Test
    public void doesHaveManeShouldBeHasManOrNot() throws Exception {
        Lion lion = new Lion(sex);
        boolean actual = lion.doesHaveMane();
        assertEquals(expected, actual);
    }

    @Test
    public void ifIntroduceIncorrectSexShouldBeException() {
        String sex = "оно";
        Throwable exception = assertThrows(Exception.class, () -> new Lion(sex));
        String expectedMessage = "Используйте допустимые значения пола животного - самей или самка";
        assertEquals(expectedMessage, exception.getMessage());
    }
}
