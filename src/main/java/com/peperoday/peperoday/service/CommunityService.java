package com.peperoday.peperoday.service;

import com.peperoday.peperoday.domain.Community;
import com.peperoday.peperoday.dto.CommunitySaveRequestDto;
import com.peperoday.peperoday.dto.CommunityUpdateRequestDto;
import com.peperoday.peperoday.repository.CommunityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@RequiredArgsConstructor
@Service
public class CommunityService {

    private final CommunityRepository communityRepository;

    @Transactional
    public Long save(CommunitySaveRequestDto requestDto){
        return communityRepository.save(requestDto.toEntity()).getCommunity_srno();
    }

    @Transactional
    public Long update(Long srno, CommunityUpdateRequestDto requestDto){
        Community community = communityRepository.findById(srno).orElseThrow(()->new IllegalArgumentException("해당 게시글이 없습니다. srno="+srno));

        community.update(requestDto.getTitle(), requestDto.getContent());

        return srno;
    }
}
