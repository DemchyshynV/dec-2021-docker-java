package com.example.dec2021dockerjava.dao;

import com.example.dec2021dockerjava.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel, Integer> {
}
