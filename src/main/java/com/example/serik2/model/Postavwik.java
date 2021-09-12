package com.example.serik2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Postavwik {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String fio;
    private String prod;
    private String tell;
    private String telegram;
    private String mail;
    private String postavwikTestAddress;
    private String postavwikProdAddress;
    @OneToMany(mappedBy = "postavwik")
    @JsonIgnore
    private List<KazpostService> services;
}
