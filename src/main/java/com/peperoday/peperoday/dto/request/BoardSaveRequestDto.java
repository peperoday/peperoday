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
    private boolean delStatus;

    @Builder
    public BoardSaveRequestDto(String mberId, String title, String content, boolean delStatus){
        this.mberId = mberId;
        this.title = title;
        this.content = content;
        this.delStatus = delStatus;
    }

    public Board toEntity(){
        return Board.builder()
                .mberId(mberId)
                .title(title)
                .content(content)
                .delStatus(false)
                .build();
    }
}
