package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		/**
		 * @link https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/context/ApplicationContext.html
		 */
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		// String name of bean is classname with lowercase first letter
		MyController myController = (MyController) ctx.getBean("myController");

		// call function within MyController class
		String greeting = myController.sayHello();

		System.out.println(greeting);
	}

}
