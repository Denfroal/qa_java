package com.example;

import java.util.List;

public class DataTest {
    public static final Object[][] FELINE_TEST = {
            {1, 1, 0},
            {1, 1, 1},
            {-5, -5, 2},
            {-1, -1, 2},
            {0, 0, 2},
            {1, 1, 2},
            {2, 2, 2},
            {3, 3, 3},
    };
    public static final Object[][] LION_TOLERABLE_SEX = {
            {"Самец", true, "Хищник", List.of("Животные", "Птицы", "Рыба")},
            {"Самка", false, "Хищник", List.of("Животные", "Птицы", "Рыба")},
            {"Самец", true, "Хищник", List.of("Животные", "Птицы", "Рыба")},
            {"Самка", false, "Хищник", List.of("Животные", "Птицы", "Рыба")},
            {"Самка", false, "Хищник", List.of("Животные", "Птицы", "Рыба")},
            {"Самка", false, "Хищник", List.of("Животные", "Птицы", "Рыба")},
            {"Самец", true, "Хищник", List.of("Трава", "Различные растения")},
            {"Самка", true, "Хищник", List.of("Животные", "Птицы", "Рыба")},
    };
    public static final Object[][] LION_NEGATIVE_SEX = {
            {"Нечто", true, "Хищник", List.of("Животные", "Птицы", "Рыба"), 5, 5, 5},
    };

}
