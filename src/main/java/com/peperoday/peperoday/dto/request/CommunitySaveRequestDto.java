package com.peperoday.peperoday.dto.request;

import com.peperoday.peperoday.domain.Community;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class CommunitySaveRequestDto {

    private String mber_id;
    private String title;
    private String content;
    private String author;

    @Builder
    public CommunitySaveRequestDto(String mber_id, String title, String content, String author){
        this.mber_id = mber_id;
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public Community toEntity(){
        return Community.builder()
                .mber_id(mber_id)
                .title(title)
                .content(content)
                .author(author)
                .build();
    }
}
