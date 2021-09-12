package com.example.serik2.dto;

import com.example.serik2.model.DataBase;
import com.example.serik2.model.KazpostService;
import com.example.serik2.model.Packet;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DataBaseDto {
    private Integer id;
    private String dataBaseName;
    private List<Packet> packets;
    private List<KazpostService> services;

    public static DataBaseDto mapDataBaseToDto(DataBase dataBase) {
        return new DataBaseDto(
                dataBase.getId(),
                dataBase.getDataBaseName(),
                dataBase.getPackets(),
                dataBase.getServices()
        );
    }
}
