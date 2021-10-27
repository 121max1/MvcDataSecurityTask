package dev.maxshkodin.mvctask.service;


import dev.maxshkodin.mvctask.model.Doctor;

import java.util.List;


public interface DoctorService {

    Doctor add(Doctor doctor);

    void delete(int id);

    Doctor update(Doctor doctor);

    Doctor getById(int id);

    List<Doctor> getAll();
}
