package org.kele.aggregatecloud.service.service;

import org.kele.aggregatecloud.service.pojo.dto.LoginDTO;
import org.kele.aggregatecloud.service.pojo.entity.SysUser;
import org.kele.aggregatecloudcommon.Result.Result;

public interface SysUserService {
    SysUser queryByUsername(String username);

    Result<Object> login(LoginDTO loginDTO);
}
