package com.wang.shiro;

import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.web.filter.authc.AuthenticatingFilter;

public class JwtToken implements AuthenticationToken {

   private String token;

   public JwtToken(String jwt){
       this.token=jwt;
   }

    @Override
    public Object getPrincipal() {
        return token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }
}
