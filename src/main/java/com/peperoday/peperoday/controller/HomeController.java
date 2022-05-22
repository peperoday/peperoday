package com.peperoday.peperoday.controller;

import com.peperoday.peperoday.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class HomeController {

    private final BoardService boardService;

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
    public String communityBoard(Model model){

        model.addAttribute("board",boardService.findAllDesc());

        return "/community/communityBoard";
    }
}
