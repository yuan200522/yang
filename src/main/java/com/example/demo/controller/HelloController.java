package com.example.demo.controller;

import com.example.demo.pojo.Address;
import com.example.demo.pojo.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public Result hello(){
        System.out.println("Hello World");
        return Result.success("1");
    }
    @RequestMapping("/getaddr")
    public Result getaddr(){
        Address address = new Address();
        address.setCity("北京");
        address.setProvince("河北");
        return Result.success(address);
    }
    @RequestMapping("/listaddr")
    public Result listaddr(){
        Address address1 = new Address();
        List<Address> list = new ArrayList<>();
        address1.setCity("北京");
        address1.setProvince("河北");
        Address address2 = new Address();
        address2.setCity("深圳");
        address2.setProvince("广东");
        list.add(address1);
        list.add(address2);
        return Result.success(list);
    }
    @RequestMapping
}
