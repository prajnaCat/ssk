package com.sk.sekong.user.controller;

import com.sk.sekong.model.TUser;
import com.sk.sekong.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author :xch
 * date:Create in 2018/7/19 16:36
 * description:
 */

@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public int addUser(TUser user){
        return userService.addUser();
    }

}
