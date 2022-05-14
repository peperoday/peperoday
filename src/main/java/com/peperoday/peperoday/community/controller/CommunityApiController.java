package com.peperoday.peperoday.community.controller;

import com.peperoday.peperoday.community.dto.CommunitySaveRequestDto;
import com.peperoday.peperoday.community.service.CommunityService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class CommunityApiController {

    private final CommunityService communityService;

    @PostMapping("/api/v1/community")
    public Long save(@RequestBody CommunitySaveRequestDto communitySaveRequestDto){
        return communityService.save(communitySaveRequestDto);
    }
}
