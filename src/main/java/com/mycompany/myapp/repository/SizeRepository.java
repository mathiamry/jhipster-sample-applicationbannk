package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.Size;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the Size entity.
 */
@SuppressWarnings("unused")
@Repository
public interface SizeRepository extends JpaRepository<Size, Long> {}
