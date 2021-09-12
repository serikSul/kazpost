package com.example.serik2.dto;

import com.example.serik2.model.KazpostService;
import com.example.serik2.model.Manager;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ManagerDto {
    private Integer id;
    private String name;
    private String telegram;
    private String mail;
    private String tell;
    private List<KazpostService> services;

    public static ManagerDto mapManagerToDto(Manager manager) {
        return new ManagerDto(
                manager.getId(),
                manager.getName(),
                manager.getTelegram(),
                manager.getMail(),
                manager.getTell(),
                manager.getServices()
        );
    }
}
