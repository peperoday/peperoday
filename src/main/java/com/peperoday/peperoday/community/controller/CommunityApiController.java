package com.peperoday.peperoday.community.controller;

import com.peperoday.peperoday.community.dto.CommunitySaveRequestDto;
import com.peperoday.peperoday.community.dto.CommunityUpdateRequestDto;
import com.peperoday.peperoday.community.service.CommunityService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class CommunityApiController {

    private final CommunityService communityService;

    @PostMapping("/api/v1/community")
    public Long save(@RequestBody CommunitySaveRequestDto requestDto){
        return communityService.save(requestDto);
    }

    @PutMapping("/api/v1/community/{community_srno}")
    public Long update(@PathVariable Long srno, @RequestBody CommunityUpdateRequestDto reqeuestDto){
        return communityService.update(srno, reqeuestDto);
    }
}
