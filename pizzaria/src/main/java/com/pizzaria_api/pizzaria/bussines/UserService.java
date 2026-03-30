package com.pizzaria_api.pizzaria.bussines;

import com.pizzaria_api.pizzaria.infrastructure.entitys.User;
import com.pizzaria_api.pizzaria.infrastructure.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public void saveUser(User user){
        repository.saveAndFlush(user);
    }

    public User getUserByEmail(String email){
        return repository.findByEmail(email).orElseThrow(
                () -> new RuntimeException("Email nao foi cadastrado")
        );
    }
    public void deleteUserByEmail(String email){
        repository.deleteByEmail(email);
    }

    public void updateUserById(Integer id, User user){
        User userEntity = repository.findById(id).orElseThrow(
                () -> new RuntimeException("Usuario nao encontrado")
        );
        User updatedUser = User.builder()
                .id(userEntity.getId())
                .email(user.getEmail() != null ? user.getEmail() : userEntity.getEmail())
                .nome(user.getNome() != null ? user.getNome() : userEntity.getNome())
                .role(userEntity.getRole())
                .password(user.getPassword() != null ? user.getPassword() : userEntity.getPassword())
                .build();
        repository.saveAndFlush(user);
    }
}

