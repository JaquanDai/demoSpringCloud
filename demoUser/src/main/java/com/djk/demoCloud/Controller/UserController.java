package com.djk.demoCloud.Controller;

import com.djk.demoCloud.Entity.User;
import com.djk.demoCloud.Service.Impl.UserServiceImpl;
import com.djk.demoCloud.Util.RestResult;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public RestResult<Object> register(@RequestBody String json) throws JsonProcessingException {
        ObjectMapper mapper =new ObjectMapper();

        User user = mapper.readValue(json, User.class);
        userService.addUser(user.getUsername(),user.getUserPwd());

        List<String> res = new ArrayList();
        res.add("zhangsan");
        res.add("lisi");

        return RestResult.ok(res,"查询成功");

    }



}
