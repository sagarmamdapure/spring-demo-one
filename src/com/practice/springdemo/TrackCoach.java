package com.practice.springdemo;

public class TrackCoach implements Coach {
    private FortuneService fortuneService;
    TrackCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    public TrackCoach() {

    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5Km";
    }

    @Override
    public String getDailyFortune() {
        return "Just do it: " + this.fortuneService.getFortune();
    }

    // add an init method
    public void doMyStartupStuff(){
        System.out.println("TrackCoach : inside doMyStartupStuff");
    }

    // add an destroy method
    public void doMyCleanupStuff() {
        System.out.println("TrackCoach : inside doMyCleanupStuff");
    }
}
