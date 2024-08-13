package com.example.demo_procedures.service.impl;

import com.example.demo_procedures.model.Doctor;
import com.example.demo_procedures.repository.DoctorRepository;
import com.example.demo_procedures.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class DoctorServiceImpl implements DoctorService {
    @Autowired
    private DoctorRepository doctorRepository;

    @Override
    public void addDoctor(String firstName, String lastName, String specialty, String phoneNumber, String email, Date hireDate) {
        doctorRepository.addDoctor(firstName, lastName, specialty, phoneNumber, email, hireDate);
    }

    @Override
    public void deleteDoctor(Long doctorId) {
        doctorRepository.deleteDoctor(doctorId);
    }

    @Override
    public void updateDoctor(Long doctorId, String firstName, String lastName, String specialty, String phoneNumber, String email, Date hireDate) {
        doctorRepository.updateDoctor(doctorId, firstName, lastName, specialty, phoneNumber, email, hireDate);
    }

    @Override
    public List<Doctor> viewDoctors() {
        return doctorRepository.viewDoctors();
    }
}
