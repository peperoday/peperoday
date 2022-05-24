package com.peperoday.peperoday.repository;

import com.peperoday.peperoday.domain.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
    //머하나만 테스트 해보자잉
}
