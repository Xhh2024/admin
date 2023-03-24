package com.example.master.controller;

import com.example.master.utils.JsonData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/user")
@Slf4j
public class UserController {

    /**
     * 测试
     * localhost:8083/api/v1/user/login
     * @return
     */
    @RequestMapping("login")
    public JsonData login(){
        log.info("hot-fix");
        return JsonData.buildSuccess();
    }
}
