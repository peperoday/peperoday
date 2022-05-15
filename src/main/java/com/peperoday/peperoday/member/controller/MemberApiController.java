package com.peperoday.peperoday.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberApiController {

    //로그인 페이지 이동
    @GetMapping("/login")
    public String loginPage(){

        return "loginPage";
    }
    
    //회원가입 페이지 이동
    @GetMapping("/join")
    public String joinPage(){

        return "joinPage";
    }
}
