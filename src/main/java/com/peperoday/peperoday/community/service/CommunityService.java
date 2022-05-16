package com.peperoday.peperoday.community.service;

import com.peperoday.peperoday.community.dto.CommunitySaveRequestDto;
import com.peperoday.peperoday.community.dto.CommunityUpdateRequestDto;
import com.peperoday.peperoday.community.repository.CommunityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Transient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@RequiredArgsConstructor
@Service
public class CommunityService {

    private final CommunityRepository communityRepository;

    @Transactional
    public Long save(CommunitySaveRequestDto requestDto){
        return communityRepository.save(requestDto.toEntity()).getCommunity_id();
    }

    @Transactional
    public Long update(Long srno, CommunityUpdateRequestDto requestDto){
        return null;
    }
}
