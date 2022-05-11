package com.peperoday.peperoday.community.repository;

import com.peperoday.peperoday.community.domain.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
