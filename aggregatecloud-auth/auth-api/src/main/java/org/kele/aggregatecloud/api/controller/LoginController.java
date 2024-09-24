package org.kele.aggregatecloud.api.controller;

import org.kele.aggregatecloud.service.pojo.dto.LoginDTO;
import org.kele.aggregatecloud.service.service.SysUserService;
import org.kele.aggregatecloudcommon.Result.Result;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class LoginController {
    private final SysUserService sysUserService;
    public LoginController(SysUserService sysUserService)
    {
        this.sysUserService = sysUserService;
    }
    @PostMapping("/login")
    public Result<Object> login(@RequestBody LoginDTO loginDTO){
        return Result.success("登录成功");
    }
    @GetMapping("/hello")
    public Result<Object> ass(){
        return Result.success("登录成功");
    }
}
