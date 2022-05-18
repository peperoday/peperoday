package com.peperoday.peperoday.domain;

import lombok.Getter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseTimeEntity {

//    이거 사용할려면 SecurityContext에서 인증정보를 주입시키는 정의 클래스가 필요함, 회원 로그인 만들어지면 하면됨
//    @CreatedBy
//    @Column(name = "REG_NM")
//    private String reg_nm;

    @CreatedDate
    @Column(name = "REG_DT")
    private LocalDateTime reg_dt;

//    이거 사용할려면 SecurityContext에서 인증정보를 주입시키는 정의 클래스가 필요함, 회원 로그인 만들어지면 하면됨
//    @LastModifiedBy
//    @Column(name = "UPD_NM")
//    private String upd_nm;

    @LastModifiedDate
    @Column(name = "UPD_DT")
    private LocalDateTime upd_dt;

}
