package cn.sun;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import javax.annotation.Resource;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        Random r1 = (Random) applicationContext.getBean("ran");
        Random r2 = (Random) applicationContext.getBean("ran");
        System.out.println("是否？" + (r1 == r2));
        r1.printRandom();
        r2.printRandom();
    }
}
