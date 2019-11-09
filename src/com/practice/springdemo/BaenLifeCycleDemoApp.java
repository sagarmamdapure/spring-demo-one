package com.practice.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BaenLifeCycleDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
        Coach theCoach = context.getBean("myCoach", Coach.class);

        System.out.println(theCoach.getDailyWorkout());
        System.out.println("Memory location of theCoach is : " + theCoach);
    }
}
