package com.example.serik2.repo;

import com.example.serik2.model.Developer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeveloperRepo extends JpaRepository<Developer,Integer> {
}
