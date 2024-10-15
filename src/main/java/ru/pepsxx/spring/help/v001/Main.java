package ru.pepsxx.spring.help.v001;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("""
                Добавить 3 зависимости:
                1: spring-core
                2: spring-beans
                3: spring-context""");

        // Получение контекста из настроек XML файла, устаревший вариант.
        // ClassPathXmlApplicationContext contextXML =
        //      new ClassPathXmlApplicationContext("classpath:spring-help.xml"); // Путь к файлу с настройками.

        // Получение контекста из по аннотациям.
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class); // Путь к Классу с настройками.

        TestBean testBean = context.getBean("testBean", TestBean.class);// Имя бина с маленькой буквы.

        System.out.println("testBean = " + testBean);

    }
}