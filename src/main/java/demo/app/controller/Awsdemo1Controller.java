package demo.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by rsola on 6/22/2022.
 */
@RestController
@RequestMapping("aws")
public class Awsdemo1Controller {

    @PostMapping("/post")
    public String create(){
        System.out.println("Aws create with method post called");
        return "Aws create call";
    }

    @GetMapping("/get")
    public String get(){
        System.out.println("Aws get method called");
        return "Aws get called";
    }
}
