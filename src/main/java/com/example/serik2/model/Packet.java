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
public class Packet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String packetName;
    @OneToMany(mappedBy = "packet")
    @JsonIgnore
    private List<Procedura> proceduras;

    @ManyToOne
    @JoinColumn(name = "dataBase_id")
    @JsonIgnore
    private DataBase dataBase;
}
