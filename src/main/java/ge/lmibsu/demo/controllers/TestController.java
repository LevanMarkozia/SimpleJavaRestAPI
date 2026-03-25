package ge.lmibsu.demo.controllers;

import ge.lmibsu.demo.dto.TestPerson;
import ge.lmibsu.demo.dto.TestPersonInfo;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/test")
public class TestController{
    @GetMapping("/hi")
    public String sayHi() {
        return "Hello from Server";
    }
    @PostMapping("/call")
    public TestPerson call(@RequestBody TestPerson p){
        p.setFirstName(p.getFirstName()+" from server");
        return p;
    }
    @PostMapping("/callRecord")
    public TestPersonInfo callRecord(@RequestBody TestPersonInfo p){
        System.out.println(p.firstName()+" "+p.lastName()+" "+p.age());
        return p.withAge(p.age()+1);
    }
}
