package com.example;

import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class FelineTest {
    @Test
    public void eatMeatTest() throws Exception {
        Feline feline = new Feline();
        var actual = feline.eatMeat();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), actual);
    }
    @Test
    public void getFamilyTest() {
        Feline feline = new Feline();
        var actual = feline.getFamily();
        assertEquals("Кошачьи", actual);
    }
    @Test
    public void getKittensTest() {
        Feline feline = new Feline();
        var actual = feline.getKittens();
        assertEquals((int) 1, actual);
    }
    @Test
    public void getSomeKittensTest() {
        Feline feline = new Feline();
        var expected = 10 * (Math.random());
        var actual = feline.getKittens((int) expected);
        assertEquals((int) expected, actual);
    }
}