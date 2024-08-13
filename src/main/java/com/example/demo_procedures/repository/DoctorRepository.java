package com.example.demo_procedures.repository;

import com.example.demo_procedures.model.Doctor;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
@Repository
public interface DoctorRepository extends CrudRepository<Doctor, Long> {
    @Modifying
    @Query("CALL AddDoctor(:firstName, :lastName, :specialty, :phoneNumber, :email, :hireDate)")
    void addDoctor(String firstName, String lastName, String specialty, String phoneNumber, String email, Date hireDate);

    @Modifying
    @Query("CALL DeleteDoctor(:doctorId)")
    void deleteDoctor(Long doctorId);

    @Modifying
    @Query("CALL UpdateDoctor(:doctorId, :firstName, :lastName, :specialty, :phoneNumber, :email, :hireDate)")
    void updateDoctor(Long doctorId, String firstName, String lastName, String specialty, String phoneNumber, String email, Date hireDate);

    @Query("CALL ViewDoctors()")
    List<Doctor> viewDoctors();
}
