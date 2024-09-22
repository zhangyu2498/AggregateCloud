package org.kele;

import org.kele.aggregatecloudcommon.Result.Result;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class contoller {
    @PostMapping("/login")
    public Result<Object> login(){
        return Result.success("登录成功");
    }
}
