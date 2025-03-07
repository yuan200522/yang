package com.example.demo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.transform.OutputKeys;

/*@RestController
public class RequestController {
    @RequestMapping("simpleParam")
    public String simpleParam(HttpServletRequest request){
        String user = request.getParameter("user");
        String name = request.getParameter("name");
        String ageStr = request.getParameter("age");
        int age = Integer.parseInt(ageStr);
        System.out.println("user:"+user+",name:"+name+",age:"+age);
        return "OK";
    }
}*/
@RestController
public class RequestController {
    @RequestMapping("/simpleParam")
    public String simpleParam(@RequestParam(name="name",required = false) String username, Integer age){
        System.out.println("user:"+username+",age:"+age);
        return "OK";
    }
}