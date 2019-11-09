package com.practice.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BaenScopeDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
        Coach theCoach = context.getBean("myCoach", Coach.class);

        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        boolean result = (theCoach == alphaCoach);
        System.out.println("Result is : " + result);
        System.out.println("Memory location of theCoach is : " + theCoach);
        System.out.println("Memory location of alphaCoach is : " + alphaCoach);
    }
}
