package firstapp.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/")
    public String index() {
        return "Greetings from FirstApp with "+port;
    }

}