package com.example.serik2.dto;

import com.example.serik2.model.DataBase;
import com.example.serik2.model.Developer;
import com.example.serik2.model.KazpostService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeveloperDto {
    private Integer id;
    private String name;
    private String telegram;
    private String mail;
    private String tell;
    private List<KazpostService> services;

    public static DeveloperDto mapDeveloperToDto(Developer developer) {
        return new DeveloperDto(
                developer.getId(),
                developer.getName(),
                developer.getTelegram(),
                developer.getMail(),
                developer.getTell(),
                developer.getServices()
        );
    }
}
