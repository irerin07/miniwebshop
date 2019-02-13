//package com.tistory.irerin07.miniwebshop.controller;
//
//import com.tistory.irerin07.miniwebshop.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//
//import java.util.List;
//
//@Controller
//public class MainController {
//    @Autowired
//    UserService userService;
//
//    @GetMapping("/main")
//    public String main(Model model){
//        List<User> list = userService.getUserAll();
//        model.addAttribute("list", list);
//        return "index";
//    }
//
//}