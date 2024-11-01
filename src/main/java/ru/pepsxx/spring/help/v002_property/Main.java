package ru.pepsxx.spring.help.v002_property;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

public class Main {
    public static void main(String[] args) {
        System.out.println("""
                Использование файлов настроек:
                1:  В классе @Configuration добавить аннотацию(и) @PropertySource с путем к файлу настроек
                    @PropertySource("classpath:myProperties.yml")
                    @PropertySource("classpath:myProperties.properties")
                2:  Для внедрения в поле поставить аннотацию @Value с именем настройки
                    @Value("${name}")
                """);

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);

        TestBean testBean = context.getBean("testBean", TestBean.class);

        System.out.println("testBean.getNamePro() = " + testBean.getNamePro());
        System.out.println("testBean.getNameYml() = " + testBean.getNameYml());

        context.close();

    }
}