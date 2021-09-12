package com.example.serik2.repo;

import com.example.serik2.model.UserName;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.criteria.CriteriaBuilder;

public interface UserNameRepo extends JpaRepository<UserName, Integer> {
}
