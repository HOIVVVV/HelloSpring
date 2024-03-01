package Seeds_Group.HelloSpring.controller;

import Seeds_Group.HelloSpring.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;

@RestController
public class HelloController {

    private final HelloService helloService;

   @Autowired
    public HelloController(HelloService helloService){
        this.helloService = helloService;
    }

    @GetMapping("/serviceHello")
    public String serviceHello(){
       ArrayList<String> nameList = new ArrayList<>(Arrays.asList("백승혜","임지헤","박준영","박준석","홍지섭"));
        return helloService.ReturnHello(nameList);
    }

    @GetMapping("/hello")
    public String hello() {
        return "안녕하세요!";
    }
}
