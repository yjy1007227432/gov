package org.competition.control;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class TestController {

    @RequestMapping("/test")
    public String test() {
        return "login";
    }

    @GetMapping("/dashboard")
    public String hello(){
        return "dashboard";
    }

    @GetMapping("/error")
    public String error(){
        return "error";
    }
}

