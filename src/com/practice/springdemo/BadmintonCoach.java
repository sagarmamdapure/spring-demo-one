package com.practice.springdemo;

public class BadmintonCoach implements Coach {
    private FortuneService fortuneService;

    BadmintonCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice back hand for 15 mins";
    }

    @Override
    public String getDailyFortune() {
        return this.fortuneService.getFortune();
    }
}
