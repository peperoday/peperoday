package com.peperoday.peperoday.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

    //로그인 페이지 이동
    @GetMapping("/login")
    public String login(){

        return "login";
    }

    //회원가입 페이지 이동
    @GetMapping("/join")
    public String join(){

        return "join";
    }

}