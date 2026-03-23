package com.pizzaria_api.pizzaria.infrastructure.repository;

import com.pizzaria_api.pizzaria.infrastructure.entitys.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer>{
}
