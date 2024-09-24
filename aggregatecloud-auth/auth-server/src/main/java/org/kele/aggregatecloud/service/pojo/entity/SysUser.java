package org.kele.aggregatecloud.service.pojo.entity;

import lombok.Data;

@Data
public class SysUser {
    private Long id;
    private String username;
    private String password;
    private String nickname;
    private Integer status;
}
