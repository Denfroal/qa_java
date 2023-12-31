package com.example;

import java.util.List;

import static com.example.DataTest.*;

public class Lion {
    Feline feline;
    boolean hasMane;
    public Lion(Feline feline, String sex) throws Exception {
        this.feline = feline;
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - Самец или Самка");
        }
    }
    public int getKittens() {
        return feline.getKittens();
    }
    public boolean doesHaveMane() {
        return hasMane;
    }
    public List<String> getFood() throws Exception {
        return feline.getFood("Хищник");
    }
}
