package brian.com.service;

import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {

    @Override
    public String getHelloMessage(String user) {
        return "Hello " + user;
    }

    @Override
    public String getWelcomeMessage() {
        return "Welcome to the demo that took forever to get through omg";
    }
}
