package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;

/**
 * This is example of dependency injection using property injector
 */
public class PropertyInjectedController {

    /*
     define object for GreetingService interface
     note that object is public
     */
    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
