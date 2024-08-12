package com.iiht.bs.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iiht.bs.service.DummyUserData;
import com.iiht.bs.model.User;

@RestController
@RequestMapping("/pwd/try.1.0")
public class UserDataController {

    @Autowired
    DummyUserData usd;

    @GetMapping("/add")
    public String addData1(@RequestBody User req) {
    	usd.addData(req);
        return "Added the request";
    }
}

