package com.wang.shiro;

import cn.hutool.log.Log;
import lombok.Data;

import java.io.Serializable;
@Data
public class AccountProFile implements Serializable {
    private Long id;

    private String username;

    private String avatar;

    private String email;
}
