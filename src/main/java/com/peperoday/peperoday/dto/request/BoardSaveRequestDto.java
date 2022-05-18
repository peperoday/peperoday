package com.peperoday.peperoday.dto.request;

import com.peperoday.peperoday.domain.Board;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class BoardSaveRequestDto {

    private String mberId;
    private String title;
    private String content;
    private String author;

    @Builder
    public BoardSaveRequestDto(String mberId, String title, String content, String author){
        this.mberId = mberId;
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public Board toEntity(){
        return Board.builder()
                .mberId(mberId)
                .title(title)
                .content(content)
                .author(author)
                .build();
    }
}
