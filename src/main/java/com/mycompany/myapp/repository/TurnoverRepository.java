package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.Turnover;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the Turnover entity.
 */
@SuppressWarnings("unused")
@Repository
public interface TurnoverRepository extends JpaRepository<Turnover, Long> {}
