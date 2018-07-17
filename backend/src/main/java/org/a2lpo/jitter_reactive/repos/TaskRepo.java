package org.a2lpo.jitter_reactive.repos;

import org.a2lpo.jitter_reactive.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepo extends JpaRepository<Task, Long> {
}
