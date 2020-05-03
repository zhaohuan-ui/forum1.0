package com.commons.request;

import lombok.Data;

/**
 *  接受登录参数
 */
@Data
public class LoginRequest {
    /**
     *  用户名
     */
    private String username;

    /**
     *  密码
     */
    private String password;
}
