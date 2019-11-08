package com.sk.sekong.user.dao;

import com.sk.sekong.model.User;

import java.util.List;

/**
 * @author :xch
 * date:Create in 2018/7/19 16:34
 * description:
 */
public interface UserDao {
        int insert(User record);

        List<User> selectUsers();
}
