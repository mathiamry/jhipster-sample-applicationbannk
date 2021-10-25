package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.Sme;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the Sme entity.
 */
@SuppressWarnings("unused")
@Repository
public interface SmeRepository extends JpaRepository<Sme, Long> {}
