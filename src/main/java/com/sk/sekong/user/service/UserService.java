package com.sk.sekong.user.service;

import com.github.pagehelper.PageInfo;
import com.sk.sekong.model.User;

/**
 * @author :xch
 * date:Create in 2018/7/19 16:39
 * description:
 */
public interface UserService {
    int addUser(User user);
    PageInfo<User> findAllUser(int pageNum,int pageSize);
        }
