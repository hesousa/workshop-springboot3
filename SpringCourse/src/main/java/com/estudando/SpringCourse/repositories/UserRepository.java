package com.estudando.SpringCourse.repositories;

import com.estudando.SpringCourse.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
