package org.com.campushikingai.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/admin/category")
public class TestController {
    @GetMapping("/test")
    public String test(){
        return "test";
    }
}
