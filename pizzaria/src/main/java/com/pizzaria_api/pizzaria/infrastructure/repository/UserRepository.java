package com.pizzaria_api.pizzaria.infrastructure.repository;

import com.pizzaria_api.pizzaria.infrastructure.entitys.User;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer>{
    Optional<User> findByEmail(String email);

    @Transactional
    void deleteByEmail(String email);
}
