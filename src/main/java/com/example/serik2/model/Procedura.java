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
public class Procedura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String proceduraName;
    @OneToMany(mappedBy = "procedura")
    @JsonIgnore
    private List<UserName> userNames;
    @ManyToOne
    @JoinColumn(name = "packet_id")
    @JsonIgnore
    private Packet packet;
}
