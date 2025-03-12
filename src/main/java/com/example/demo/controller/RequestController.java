package com.example.demo.controller;

import com.example.demo.pojo.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

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
    @RequestMapping("/simplepojo")
    public String simplepojo(User user){
        System.out.println(user);
        return "OK";
    }
    @RequestMapping("/complexpojo")
    public String complexpojo(User user){
        System.out.println(user);
        return "OK";
    }
    @RequestMapping("/arrayparam")
    public String arrayparam(String[] habby){
        System.out.println(Arrays.toString(habby));
        return "OK";
    }
    @RequestMapping("/listparam")
    public String listparam(@RequestParam List<String> hobby) {
        System.out.println(hobby);
        return "OK";
    }
    @RequestMapping("/dateParam")
    public String dateParam(@DateTimeFormat(pattern = "yyyy-mm-dd hh-mm-ss") LocalDateTime updateTime) {
        System.out.println(updateTime);
        return "OK";
    }
    @RequestMapping("/jsonParam")
    public String jsonParam(@RequestBody User user){
        System.out.println(user);
        return "OK";
    }
}
