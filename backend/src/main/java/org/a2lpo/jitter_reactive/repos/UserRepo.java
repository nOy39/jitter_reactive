package org.a2lpo.jitter_reactive.repos;

import org.a2lpo.jitter_reactive.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, String> {
}
