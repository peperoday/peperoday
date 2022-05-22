package com.peperoday.peperoday.dto.response;

import com.peperoday.peperoday.domain.Board;
import lombok.Getter;

@Getter
public class BoardListResponseDto {

    private Long boardSrno;

    private String mberId;

    private String title;

    private String content;

    public BoardListResponseDto(Board entity){
        this.boardSrno = entity.getBoardSrno();
        this.mberId = entity.getMberId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
    }
}
