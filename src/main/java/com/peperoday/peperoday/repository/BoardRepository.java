package com.peperoday.peperoday.repository;

import com.peperoday.peperoday.domain.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BoardRepository extends JpaRepository<Board, Long> {

    @Query("SELECT b FROM Board b ORDER BY b.boardSrno DESC")
    List<Board> findAllDesc();
}
