package com.tistory.irerin07.miniwebshop.service;

import com.tistory.irerin07.miniwebshop.repository.RoleRepository;
import com.tistory.irerin07.miniwebshop.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    public final static String NAME_SEARCH = "name_search";
    public final static String NICKNAME_SEARCH = "title_search";
    public final static String EMAIL_SEARCH = "content_search";
    public final static String ADDRESS_SEARCH = "title_content_search";
    public final static String CONTACT_NUMBER_SEARCH = "title_content_search";


//    UserRepository userRepository;
//
//    public UserService(UserRepository userRepository){
//        this.userRepository = userRepository;
//    }
//
//    public List<User> getUserAll(){
//        return userRepository.findAll();
//    }
}
