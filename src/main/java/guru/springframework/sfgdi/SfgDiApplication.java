package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.ConstructorInjectedController;
import guru.springframework.sfgdi.controllers.MyController;
import guru.springframework.sfgdi.controllers.PropertyInjectedController;
import guru.springframework.sfgdi.controllers.SetterInjectedController;
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

		/*
		1. Add @Controller on Controller class otherwise you will get 'No bean named @classname available'
		2. Add @Autowired on object definition which is being injected otherwise you will get 'null pointer' as
		   spring has no idea you suppose to inject in particular object. It is optional in ConstructorInjectedController
		3. Ass @Service on business service class to inform spring to autowire @service object
		 */

		// PropertyInjector
		System.out.println("This is PropertyInjector");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		// SetterInjector
		System.out.println("This is SetterInjector");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		// ConstructorInjector
		System.out.println("This is ConstructorInjector");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());

	}

}
