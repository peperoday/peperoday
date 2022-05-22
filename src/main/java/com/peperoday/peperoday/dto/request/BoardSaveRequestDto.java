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

    @Builder
    public BoardSaveRequestDto(String mberId, String title, String content){
        this.mberId = mberId;
        this.title = title;
        this.content = content;
    }

    public Board toEntity(){
        return Board.builder()
                .mberId(mberId)
                .title(title)
                .content(content)
                .build();
    }
}
