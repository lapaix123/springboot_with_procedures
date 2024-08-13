package com.example.demo_procedures.controller;

import com.example.demo_procedures.model.Doctor;
import com.example.demo_procedures.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/doctors")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @PostMapping("/add")
    public void addDoctor(@RequestBody Doctor doctor) {
        doctorService.addDoctor(doctor.getFirstName(), doctor.getLastName(), doctor.getSpecialty(),
                doctor.getPhoneNumber(), doctor.getEmail(), doctor.getHireDate());
    }

    @DeleteMapping("/delete/{id}")
    public void deleteDoctor(@PathVariable Long id) {
        doctorService.deleteDoctor(id);
    }

    @PutMapping("/update/{id}")
    public void updateDoctor(@PathVariable Long id, @RequestBody Doctor doctor) {
        doctorService.updateDoctor(id, doctor.getFirstName(), doctor.getLastName(), doctor.getSpecialty(),
                doctor.getPhoneNumber(), doctor.getEmail(), doctor.getHireDate());
    }

    @GetMapping("/view")
    public List<Doctor> viewDoctors() {
        return doctorService.viewDoctors();
    }
}
