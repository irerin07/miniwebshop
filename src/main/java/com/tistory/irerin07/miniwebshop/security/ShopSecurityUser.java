//package com.tistory.irerin07.miniwebshop.security;
//
//import lombok.Getter;
//import lombok.Setter;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.User;
//
//import java.util.Collection;
//
//@Getter
//@Setter
//public class ShopSecurityUser extends User {
//    private Long userId;
//    private String nickName;
//    private String name;
//
//    public ShopSecurityUser(String username, String password, Collection<? extends GrantedAuthority> authorities) {
//        super(username, password,true, true, true, true, authorities);
//    }
//
//    public String getEmail(){
//        return super.getUsername();
//    }
//
//}
