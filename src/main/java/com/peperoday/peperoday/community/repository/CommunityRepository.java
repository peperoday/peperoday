package com.peperoday.peperoday.community.repository;

import com.peperoday.peperoday.community.domain.Community;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommunityRepository extends JpaRepository<Community, Long> {
}
