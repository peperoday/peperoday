package com.peperoday.peperoday.controller;

import com.peperoday.peperoday.dto.request.CommunitySaveRequestDto;
import com.peperoday.peperoday.dto.request.CommunityUpdateRequestDto;
import com.peperoday.peperoday.service.CommunityService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class CommunityController {

    private final CommunityService communityService;

    @PostMapping("/api/v1/community")
    public Long save(@RequestBody CommunitySaveRequestDto requestDto){

        return communityService.save(requestDto);
    }

    @PutMapping("/api/v1/community/{srno}")
    public Long update(@PathVariable Long srno, @RequestBody CommunityUpdateRequestDto reqeuestDto){
        return communityService.update(srno, reqeuestDto);
    }
}
