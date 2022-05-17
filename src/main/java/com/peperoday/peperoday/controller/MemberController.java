package com.peperoday.peperoday.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

    //로그인 페이지 이동
    @GetMapping("/loginPage")
    public String loginPage(){

        return "loginPage";
    }

    //회원가입 페이지 이동
    @GetMapping("/joinPage")
    public String joinPage(){

        return "joinPage";
    }

}