package com.peperoday.peperoday.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    //메인 페이지
    @GetMapping("/")
    public String home(){

        return "index";
    }
    
    //로그인 페이지
    @GetMapping("/loginPage")
    public String loginPage(){

        return "/members/loginPage";
    }
    
    //회원가입 페이지
    @GetMapping("/joinPage")
    public String joinPage(){

        return "/members/joinPage";
    }
    
    //타임라인게시판 페이지
    @GetMapping("/communityHome")
    public String communityPage(){

        return "/community/communityTimeline";
    }
    
    //커뮤니티게시판 페이지
    @GetMapping("/communityBoard")
    public String communityBoard(){

        return "/community/communityBoard";
    }
}
