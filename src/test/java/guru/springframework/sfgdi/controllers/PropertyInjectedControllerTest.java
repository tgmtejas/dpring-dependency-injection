package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        // define PropertyInjectedController object
        controller = new PropertyInjectedController();

        /*
         define GreetingServiceImpl object
         note that GreetingService interface object is defined in PropertyInjectedController
         so we are defining GreetingServiceImpl class object extended from GreetingService interface
         */
        controller.greetingService = new ConstructorGreetingService();
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}