package com.example.serik2.repo;

import com.example.serik2.model.Packet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacketRepo extends JpaRepository<Packet,Integer> {
}
