package com.example.demo_procedures.service;

import com.example.demo_procedures.model.Doctor;

import java.util.Date;
import java.util.List;

public interface DoctorService {
    void addDoctor(String firstName, String lastName, String specialty, String phoneNumber, String email, Date hireDate);
    void deleteDoctor(Long doctorId);
    void updateDoctor(Long doctorId, String firstName, String lastName, String specialty, String phoneNumber, String email, Date hireDate);
    List<Doctor> viewDoctors();
}
