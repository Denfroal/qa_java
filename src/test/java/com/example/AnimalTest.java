package com.example;

import org.junit.Assert;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;
public class AnimalTest {
    @Test
    public void getFoodForPredatorTest() throws Exception {
        Animal animal = new Animal();
        var actual = animal.getFood("Хищник");
        assertEquals(List.of("Животные", "Птицы", "Рыба"), actual);
    }
    @Test
    public void getFoodForHerbivoreTest() throws Exception {
        Animal animal = new Animal();
        var actual = animal.getFood("Травоядное");
        assertEquals(List.of("Трава", "Различные растения"), actual);
    }
    @Test
    public void getFoodForOthersTest() {
        Animal animal = new Animal();
        try {
            animal.getFood("Всеядное");
        } catch (Exception e) {
            Assert.assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", e.getMessage());
        }
    }
    @Test
    public void getFamilyTest() {
        Animal animal = new Animal();
        var actual = animal.getFamily();
        assertEquals("Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи", actual);
    }
}