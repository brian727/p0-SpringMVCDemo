package brian.com.controller;

import brian.com.service.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
public class DemoController {

    // == FIELDS ==
    private final DemoService demoService;

    // == CONSTRUCTORS ==
    @Autowired
    public DemoController(DemoService demoService) {
        this.demoService = demoService;
    }

    // == REQUEST METHODS ==
        // http://localhost:8080/todo-list/hello
    @ResponseBody
    @GetMapping("/hello")
    public String hello(){
        return "hello batch";
    }

        // http://localhost:8080/todolist/welcome
        // http://localhost:8080/todolist/welcome?user=<USERNAME>
    @GetMapping("welcome")
    public String welcome(@RequestParam String user, @RequestParam int age, Model model) {
        model.addAttribute("helloMessage", demoService.getHelloMessage(user));
        model.addAttribute("age", age);
        log.info("model={}", model);

        // prefix + name + suffix via WebConfig class
        // /WEB-INF/view/welcome.jsp
        return "welcome";
    }

    // == MODEL ATTRIBUTES ==
    @ModelAttribute("welcomeMessage")
    public String welcomeMessage(){
        log.info("welcomeMessage() called");
        return demoService.getWelcomeMessage();
    }

}








