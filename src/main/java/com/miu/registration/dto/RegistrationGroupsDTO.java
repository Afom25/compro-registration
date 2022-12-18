package com.miu.registration.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegistrationGroupsDTO {

    private Long registrationid;

    private String fpptrack ;

    private String mpptrack;
}