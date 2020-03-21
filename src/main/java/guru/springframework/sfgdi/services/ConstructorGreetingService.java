package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service // this tells spring that this is spring managed component and bring it into Spring Context
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Constructor";
    }
}
