package com.example.serik2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class KazpostService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String serviceName;
    private String ourTestAddress;
    private String ourProdAddress;
    private String description;
    private boolean documentation;
    private String typeIntegration;
    private boolean naboyu;

    @ManyToOne
    @JoinColumn(name="dataBase_id")
//    @JsonIgnore
    private DataBase dataBase;

    @ManyToOne
    @JoinColumn(name="developer_id")
   // @JsonIgnore
    private Developer developer;

    @ManyToOne
    @JoinColumn(name="manager_id")
    //@JsonIgnore
    private Manager manager;

    @ManyToOne
    @JoinColumn(name="postavwik_id")
   // @JsonIgnore
    private Postavwik postavwik;
}
