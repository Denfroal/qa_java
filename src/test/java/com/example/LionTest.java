package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static com.example.DataTest.*;

@RunWith(Parameterized.class)
public class LionTest {
    private final String sex;
    private boolean exMane;
    private final String type;
    private final List food;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Mock
    Feline feline;

    public LionTest(String sex, boolean exMane, String type, List food) {
        this.sex = sex;
        this.exMane = exMane;
        this.type = type;
        this.food = food;
    }

    @Parameterized.Parameters
    public static Object[][] params() {
        return LION_TOLERABLE_SEX;
    }

    //Это тесты
    @Test
    public void getKittensTest() throws Exception {
            Lion lion = new Lion(feline, sex);
            Mockito.when(feline.getKittens()).thenReturn(1);
            Assert.assertEquals("Результат не совпадает с ожидаемым",  1, lion.getKittens());
    }

    @Test
    public void doesHaveManeTest() {
        try {
            Lion lion = new Lion(feline, sex);
            //assertThrows(Exception.class, () -> new Lion(feline, "Нечто"));
            lion.doesHaveMane();
        } catch (Exception e) {
            Assert.assertEquals(
                    "Используйте допустимые значения пола животного - Самец или Самка",
                    e.getMessage());
        }
    }

    @Test
    public void getFoodTest() throws Exception {
        Lion lion = new Lion(feline, sex);
        Mockito.when(feline.getFood(type)).thenReturn(food);
        Assert.assertEquals("Неподходящая еда", food, lion.getFood());
    }
}