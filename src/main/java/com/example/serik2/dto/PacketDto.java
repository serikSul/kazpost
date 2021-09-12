package com.example.serik2.dto;

import com.example.serik2.model.Packet;
import com.example.serik2.model.Procedura;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PacketDto {
    private Integer id;
    private String packetName;
    private List<Procedura> proceduras;

    public static PacketDto mapPacketToDto(Packet packet) {
        return new PacketDto(
                packet.getId(),
                packet.getPacketName(),
                packet.getProceduras()
        );
    }
}
