//package com.tistory.irerin07.miniwebshop.security;
//
//import com.tistory.irerin07.miniwebshop.repository.UserRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Component;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Set;
//
//@Component //클래스 명은 Service이지만 실제로 이 클래스가 작동하는 곳은 Filter쪽이다. 즉, Bean으로 등록하기 위해서는 Service가 아닌 Componenet를 사용해야한다.
//@RequiredArgsConstructor //final이 붙은 필드를 초기화 해주는 생성자를 자동으로 생성해준다. 생성자 주입시 사용한다.
//public class ShopUserDetailsService implements UserDetailsService {
//
//    private final UserRepository userRepository;
//
//    @Override
//    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
//        User user = userRepository.getUserByEmail(email);
//
//        if(user == null){
//            throw new UsernameNotFoundException("can not find the user with the email: " + email);
//        }
//
//        List<GrantedAuthority> authorityList = new ArrayList<>();
//        Set<Role> roleSet   = user.getRoles();
//
//        for(Role role : roleSet){
//            authorityList.add(new SimpleGrantedAuthority("ROLE_" + role.getRoleName()));
//        }
//
//        ShopSecurityUser shopSecurityUSer = new ShopSecurityUser(email, user.getPasswd(), authorityList);
//        shopSecurityUSer.setUserId(user.getUserId());
//        shopSecurityUSer.setName(user.getName());
//        shopSecurityUSer.setNickName(user.getNickname());
//
//        return shopSecurityUSer;
//    }
//}
