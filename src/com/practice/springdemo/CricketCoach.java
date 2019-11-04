package com.practice.springdemo;

public class CricketCoach implements Coach {
    private FortuneService fortuneService;

    CricketCoach() {
        System.out.println("CricketCoach : inside default constructor");
    }

    public FortuneService getFortuneService() {
        return fortuneService;
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach : inside setter method - setFortuneService");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice wicket keeping";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
