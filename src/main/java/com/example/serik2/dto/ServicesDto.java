package com.example.serik2.dto;

import com.example.serik2.model.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ServicesDto {
    private Integer id;
    private String serviceName;
    private String ourTestAddress;
    private String ourProdAddress;
    private String description;
    private boolean documentation;
    private String typeIntegration;
    private boolean naboyu;

    private DataBase dataBase;

    private Developer developer;

    private Postavwik postavwik;
    private Manager manager;

    public static ServicesDto mapServiceToDto(KazpostService services) {

        DataBase d = new DataBase();
        d.setDataBaseName(services.getDataBase().getDataBaseName());
        d.setId(services.getDataBase().getId());
        d.setPackets(services.getDataBase().getPackets());

        return new ServicesDto(
                services.getId(),
                services.getServiceName(),
                services.getOurTestAddress(),
                services.getOurProdAddress(),
                services.getDescription(),
                services.isDocumentation(),
                services.getTypeIntegration(),
                services.isNaboyu(),
                d,
                services.getDeveloper(),
                services.getPostavwik(),
                services.getManager()
        );
    }
}
