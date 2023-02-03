package luv2code;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/spring.xml");

		Coach coach = context.getBean("Coach", Coach.class);

		System.out.println(coach.getDailyFortune());
		System.out.println(coach.getDailyWorkout());
	}
}
