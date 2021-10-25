package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.History;
import java.util.List;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the History entity.
 */
@SuppressWarnings("unused")
@Repository
public interface HistoryRepository extends JpaRepository<History, Long> {
    @Query("select history from History history where history.author.login = ?#{principal.username}")
    List<History> findByAuthorIsCurrentUser();
}
