package com.spring.a20072021;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {

        ApplicationContext context1 = new ClassPathXmlApplicationContext("SpringConfig.xml");
        Kurs kurs = (Kurs) context1.getBean("kursBean");
        kurs.getAllStudents();


    }

}
