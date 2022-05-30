package com.peperoday.peperoday.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Table(name = "BOARD")
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

    @Column(name = "DEL_STATUS")
    private boolean delStatus;

    @Builder
    public Board(String mberId, String title, String content, boolean delStatus){
        this.mberId = mberId;
        this.title = title;
        this.content = content;
        this.delStatus = delStatus;
    }

    public void update(String title, String content){
        this.title = title;
        this.content = content;
    }
}
