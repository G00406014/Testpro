package ie.atu.labweek1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@RestController

public class RequestController {
    @GetMapping("/hello")

    public String hello() {

        return "hello";

    }
    @GetMapping("/greet/{name}")
    public String GreetByName (@PathVariable String name){
        return "hello" + name;
    }
    @GetMapping("/details")
    public String details(@RequestParam Integer age) {
        return "details query" + age ;
    }




}


