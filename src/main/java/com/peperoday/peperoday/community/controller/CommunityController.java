package com.peperoday.peperoday.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CommunityController {

    @GetMapping("/communityHome")
    public String community(){

        return "communityIndex";
    }

    @GetMapping("/communityBoard")
    public String communityBoard(){

        return "/community/communityBoard";
    }
}
