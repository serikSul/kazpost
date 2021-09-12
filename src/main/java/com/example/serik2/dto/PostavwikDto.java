package com.example.serik2.dto;

import com.example.serik2.model.KazpostService;
import com.example.serik2.model.Postavwik;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostavwikDto {
    private Integer id;
    private String fio;
    private String prod;
    private String tell;
    private String telegram;
    private String mail;
    private String postavwikTestAddress;
    private String postavwikProdAddress;
    private List<KazpostService> services;

    public static PostavwikDto mapPostavwikToDto(Postavwik postavwik) {
        return new PostavwikDto(
                postavwik.getId(),
                postavwik.getFio(),
                postavwik.getProd(),
                postavwik.getTell(),
                postavwik.getTelegram(),
                postavwik.getMail(),
                postavwik.getPostavwikTestAddress(),
                postavwik.getPostavwikProdAddress(),
                postavwik.getServices()
        );
    }
}
