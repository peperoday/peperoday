package com.peperoday.peperoday.controller;

import com.peperoday.peperoday.dto.CommunitySaveRequestDto;
import com.peperoday.peperoday.dto.CommunityUpdateRequestDto;
import com.peperoday.peperoday.service.CommunityService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class CommunityController {

    private final CommunityService communityService;

    @GetMapping("/communityHome")
    public String community(){

        return "communityIndex";
    }

    @GetMapping("/communityBoard")
    public String communityBoard(){

        return "/community/communityBoard";
    }

    @PostMapping("/api/v1/community")
    public Long save(@RequestBody CommunitySaveRequestDto requestDto){
        return communityService.save(requestDto);
    }

    @PutMapping("/api/v1/community/{srno}")
    public Long update(@PathVariable Long srno, @RequestBody CommunityUpdateRequestDto reqeuestDto){
        return communityService.update(srno, reqeuestDto);
    }
}
