package luv2code;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// load the spring configuration file
		ApplicationContext context =new FileSystemXmlApplicationContext("src/main/resources/spring.xml");
		//retrieve bean from spring container
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
		//call methods on the bean
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getDailyWorkout());

		System.out.println(theCoach.getTeam());
		System.out.println(theCoach.getEmailAdress());
	}
}
