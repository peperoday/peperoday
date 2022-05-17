package com.peperoday.peperoday.community.domain;

import com.peperoday.peperoday.utiles.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
//@Table(name = "TB_COMMUNITY_M")
public class Community extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long community_id;

    @Column(nullable = false)
    private String mber_id;

    @Column(length = 100, nullable = false)
    private String title;

    @Column(nullable = false)
    private String content;

    private String author;

    @Builder
    public Community(String mber_id, String title, String content, String author){
        this.mber_id = mber_id;
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void update(String title, String content){
        this.title = title;
        this.content = content;
    }
}
