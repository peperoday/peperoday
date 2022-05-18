package com.peperoday.peperoday.dto.response;

import com.peperoday.peperoday.domain.Board;
import lombok.Getter;

@Getter
public class BoardResponseDto {

    private Long srno;
    private String title;
    private String content;
    private String author;

    public BoardResponseDto(Board entity){
        this.srno = entity.getBoardSrno();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.author = entity.getAuthor();
    }
}
