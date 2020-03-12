package springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {

		/*
		 * ApplicationContext context = new
		 * ClassPathXmlApplicationContext("spring.xml"); Painter painter =
		 * context.getBean(Painter.class); painter.paint();
		 */

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		System.out.println(context.getBean(Rectangle.class));
		context.getBean(Painter.class).paint();

	}

}
