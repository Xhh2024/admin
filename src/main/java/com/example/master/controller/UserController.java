package com.example.master.controller;

import com.example.master.utils.JsonData;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/user")
public class UserController {

    /**
     * 测试
     * localhost:8083/api/v1/user/login
     * @return
     */
    @RequestMapping("login")
    public JsonData login(){
        return JsonData.buildSuccess();
    }
}
