package com.peperoday.peperoday.member.domain;

import com.peperoday.peperoday.utiles.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Entity
public class Member extends BaseTimeEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "mber_srno")
    private Long srNo;

    @Column(name = "mber_id", nullable = false)
    private String mberId;

    @Column(name = "mber_pw", nullable = false)
    private String mberPw;

    @Column(name = "mber_nm", nullable = false)
    private String mberNm;

    @Column(name = "mber_email", nullable = false)
    private String mberEmail;

    //탈퇴여부: withdrawal
    @ColumnDefault("N")
    private boolean withdrawal;

    @Column
    @Enumerated(value = EnumType.STRING)
    private Role role;

    @Builder
    public Member(String mberId, String mberPw, String mberEmail, String mberNm){
        this.mberId = mberId;
        this.mberPw = mberPw;
        this.mberEmail = mberEmail;
        this.mberNm = mberNm;
    }
}