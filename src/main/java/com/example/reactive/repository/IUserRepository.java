package com.example.reactive.repository;

import com.example.reactive.entity.User;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface IUserRepository extends ReactiveMongoRepository<User, String> {
}
