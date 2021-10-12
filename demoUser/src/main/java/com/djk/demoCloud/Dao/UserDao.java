package com.djk.demoCloud.Dao;


import com.djk.demoCloud.Entity.User;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

    private final MongoTemplate mongoTemplate;

    public UserDao(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    public void addUser(String username,String userPwd){
        User user = new User();
        user.setUsername(username);
        user.setUserPwd(userPwd);
        mongoTemplate.insert(user);
    }



}
