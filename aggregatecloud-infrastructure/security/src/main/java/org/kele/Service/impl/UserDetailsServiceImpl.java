package org.kele.Service.impl;

import jakarta.annotation.Resource;
import org.kele.aggregatecloud.service.pojo.entity.SysUser;
import org.kele.aggregatecloud.service.service.SysUserService;
import org.kele.pojo.entity.AdminUser;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Objects;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Resource
    private SysUserService sysUserService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        SysUser sysUser = sysUserService.queryByUsername(username);

        if (Objects.isNull(sysUser)){
            throw new UsernameNotFoundException("用户名不存在！");
        }

        if(sysUser.getStatus() == 0) {
            throw new RuntimeException("账号已停用");
        }
        return new AdminUser(sysUser, Collections.emptyList());
    }
}
