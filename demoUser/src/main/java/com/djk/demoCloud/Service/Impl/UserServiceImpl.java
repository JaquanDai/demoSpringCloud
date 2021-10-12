package com.djk.demoCloud.Service.Impl;

import com.djk.demoCloud.Dao.UserDao;
import com.djk.demoCloud.Service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void addUser(String username, String userPwd) {
        userDao.addUser(username,userPwd);
    }
}
