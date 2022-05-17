package com.peperoday.peperoday.domain;

import lombok.Getter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseTimeEntity {


    @CreatedBy
    private String reg_nm;

    @CreatedDate
    private LocalDateTime reg_dt;

    @LastModifiedBy
    private String upd_nm;

    @LastModifiedDate
    private LocalDateTime upd_dt;

}
