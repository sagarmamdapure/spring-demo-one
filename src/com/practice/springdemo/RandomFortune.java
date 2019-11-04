package com.practice.springdemo;

import java.util.Random;

public class RandomFortune implements FortuneService {
    private String[] fortuneArray = {"Very Good Fortune", "Not Bad Fortune", "Not Good Fortune"};
    @Override
    public String getFortune() {
        int randInt = new Random().nextInt(fortuneArray.length);
        return fortuneArray[randInt];
    }
}
