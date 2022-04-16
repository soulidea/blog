package com.wang.util;

import com.wang.shiro.AccountProFile;
import org.apache.shiro.SecurityUtils;

public class ShiroUtil {

    public static AccountProFile getProfile() {
        return (AccountProFile) SecurityUtils.getSubject().getPrincipal();
    }

}
