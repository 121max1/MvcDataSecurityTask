package dev.maxshkodin.mvctask.service;


import dev.maxshkodin.mvctask.model.Doctor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DoctorService {

    Doctor add(Doctor doctor);

    void delete(int id);

    Doctor update(Doctor doctor);

    Doctor getById(int id);

    List<Doctor> getAll();
}
