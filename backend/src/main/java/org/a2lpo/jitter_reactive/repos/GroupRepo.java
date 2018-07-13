package org.a2lpo.jitter_reactive.repos;

import org.a2lpo.jitter_reactive.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepo extends JpaRepository<Category, Long> {
}
