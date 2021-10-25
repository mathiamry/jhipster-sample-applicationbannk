package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.ActivityArea;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the ActivityArea entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ActivityAreaRepository extends JpaRepository<ActivityArea, Long> {}
