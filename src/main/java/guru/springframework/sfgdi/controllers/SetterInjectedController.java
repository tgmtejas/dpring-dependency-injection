package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;

/**
 * This is example of dependency injection using setters
 */
public class SetterInjectedController {

    /*
     define object for GreetingService interface
     note that object is public
     */
    public GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
