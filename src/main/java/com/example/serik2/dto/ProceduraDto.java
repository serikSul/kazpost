package com.example.serik2.dto;

import com.example.serik2.model.Packet;
import com.example.serik2.model.Procedura;
import com.example.serik2.model.UserName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProceduraDto {
    private Integer id;
    private String proceduraName;
    private List<UserName> userNames;
    private Packet packet;

    public static ProceduraDto mapProceduraToDto(Procedura procedura) {
        return new ProceduraDto(
                procedura.getId(),
                procedura.getProceduraName(),
                procedura.getUserNames(),
                procedura.getPacket()
        );
    }
}
