package sbootpack;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hellocontroller {

    @RequestMapping("/hello/id")
    public String hi(){
        return "hi";
    }
}
