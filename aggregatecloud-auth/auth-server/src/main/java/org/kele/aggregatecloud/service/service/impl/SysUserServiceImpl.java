package org.kele.aggregatecloud.service.service.impl;

import org.kele.aggregatecloud.service.pojo.dto.LoginDTO;
import org.kele.aggregatecloud.service.pojo.entity.SysUser;
import org.kele.aggregatecloud.service.service.SysUserService;
import org.kele.aggregatecloudcommon.Result.Result;
import org.springframework.stereotype.Service;

@Service
public class SysUserServiceImpl implements SysUserService {
    @Override
    public SysUser queryByUsername(String username) {
        return null;
    }

    @Override
    public Result<Object> login(LoginDTO loginDTO) {
        return null;
    }
}
