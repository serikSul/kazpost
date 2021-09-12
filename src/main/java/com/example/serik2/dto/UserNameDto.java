package com.example.serik2.dto;

import com.example.serik2.model.Procedura;
import com.example.serik2.model.UserName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserNameDto {
    private Integer id;
    private String userName;
    private Procedura procedura;

    public static UserNameDto mapUserNameToDto(UserName userName) {
        return new UserNameDto(
                userName.getId(),
                userName.getUserName(),
                userName.getProcedura()
        );
    }
}
