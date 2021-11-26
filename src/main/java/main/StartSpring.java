package main;

import model.Attainment;
import model.Game;
import model.Player;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartSpring {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
//        Attainment killer = ctx.getBean("killer", Attainment.class);

        Game stalkerGame = ctx.getBean("stalkerGame", Game.class);
                System.out.println(stalkerGame);
    }
}
