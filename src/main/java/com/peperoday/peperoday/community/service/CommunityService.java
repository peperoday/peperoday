package com.peperoday.peperoday.community.service;

import com.peperoday.peperoday.community.dto.CommunitySaveRequestDto;
import com.peperoday.peperoday.community.repository.CommunityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Transient;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CommunityService {

    private final CommunityRepository communityRepository;

    @Transient
    public Long save(CommunitySaveRequestDto communitySaveRequestDto){
        return communityRepository.save(communitySaveRequestDto.toEntity()).getCommunity_id();
    }
}
