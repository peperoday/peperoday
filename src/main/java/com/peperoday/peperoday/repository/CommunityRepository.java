package com.peperoday.peperoday.repository;

import com.peperoday.peperoday.domain.Community;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommunityRepository extends JpaRepository<Community, Long> {
}
