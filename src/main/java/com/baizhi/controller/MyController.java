package com.baizhi.controller;

import com.baizhi.dao.UserMapper;
import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("mc")
@RestController
public class MyController {
    @Autowired
    UserService userService;

    @RequestMapping("liu")
    public List<User> select() {
        return userService.selectAll();
    }

}
