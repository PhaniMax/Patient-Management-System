package com.phanimax.patient_service.dto;

import lombok.Data;

@Data // gives setter and getters
public class PatientResponseDTO {

    private String id;
    private String name;
    private String email;
    private String address;
    private String dateOfBirth;
}
