package com.peperoday.peperoday.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Table(name = "TB_BOARD_M")
@Entity
public class Board extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BOARD_SRNO")
    private Long boardSrno;

    @Column(name = "MBER_ID")
    private String mberId;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "CONTENT")
    private String content;
    @Column(name = "AUTHOR")
    private String author;

    @Builder
    public Board(String mberId, String title, String content, String author){
        this.mberId = mberId;
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void update(String title, String content){
        this.title = title;
        this.content = content;
    }
}
