package com.peperoday.peperoday.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class CommunityUpdateRequestDto {

    private String title;

    private String content;

    @Builder
    public CommunityUpdateRequestDto(String title, String content){
        this.title = title;
        this.content = content;
    }
}
