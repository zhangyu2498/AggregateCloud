package org.kele.aggregatecloud.api.controller;

import org.kele.aggregatecloudcommon.Result.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class LoginController {
    @PostMapping("/login")
    public Result<Object> login(){
        System.out.println("登录成功");
        return Result.success("登录成功");
    }
}
