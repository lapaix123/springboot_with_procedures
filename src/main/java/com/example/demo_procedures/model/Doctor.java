package com.example.demo_procedures.model;

import lombok.Data;

import java.util.Date;
@Data
public class Doctor {
    private Long doctorId;
    private String firstName;
    private String lastName;
    private String specialty;
    private String phoneNumber;
    private String email;
    private Date hireDate;
}
