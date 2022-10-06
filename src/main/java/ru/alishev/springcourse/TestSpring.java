package ru.alishev.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        //Diese Klasse wendet sich an SpringApplicationContext, liest es aus
        // und fügt alle Beans, die dort beschrieben sind in SpingApplicationContext
        // Hier haben wir ApplicationContext erstellt.
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // id des Beans muss man schreiben, 2 Parameter, Objekt der Klasse
        // Hier haben wir Objekt unserer Klasse erhalten
        TestBean testBean= context.getBean("testBean", TestBean.class);
        System.out.println(testBean.getName());
        context.close();
    }
}
