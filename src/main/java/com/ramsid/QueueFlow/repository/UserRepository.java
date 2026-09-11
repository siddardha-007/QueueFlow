package com.ramsid.QueueFlow.repository;

import com.ramsid.QueueFlow.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
