package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * This is example of dependency injection using setters
 */
@Controller
public class SetterInjectedController {

    /*
     define object for GreetingService interface
     note that object is public
     */
    @Qualifier("setterInjectedGreetingService")
    @Autowired
    public GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}

