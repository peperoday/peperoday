package com.peperoday.peperoday.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CommunityController {

    @GetMapping("/community")
    public String community(){

        return "/community/communityHome";
    }
}
