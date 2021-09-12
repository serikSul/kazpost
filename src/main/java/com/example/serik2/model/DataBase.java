package com.example.serik2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DataBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String dataBaseName;
    @OneToMany(mappedBy = "dataBase")
    @JsonIgnore
    private List<Packet> packets;
    @OneToMany(mappedBy = "dataBase")
    @JsonIgnore
    private List<KazpostService> services;
}
