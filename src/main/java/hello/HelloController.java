package hello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@EnableAutoConfiguration
@Configuration
@ComponentScan
@Controller
public class HelloController {
    @Value("${name}")
    private String name;

    @RequestMapping("/api")
    @ResponseBody
    public String index() {
        return "Greetings from Spring Boot to " + name + "!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(HelloController.class, args);
    }

}
