package dev.maxshkodin.mvctask.service.impl;

import dev.maxshkodin.mvctask.model.Doctor;
import dev.maxshkodin.mvctask.repository.DoctorRepository;
import dev.maxshkodin.mvctask.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Component
@Transactional
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    @Override
    public Doctor add(Doctor doctor) {
         return doctorRepository.save(doctor);
    }

    @Override
    public void delete(int id) {
        doctorRepository.delete(id);
    }

    @Override
    public Doctor update(Doctor doctor) {
       return doctorRepository.save(doctor);
    }

    @Override
    public Doctor getById(int id) {
        return doctorRepository.getOne(id);
    }

    @Override
    public List<Doctor> getAll() {
        return doctorRepository.findAll();
    }
}
