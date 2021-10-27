package dev.maxshkodin.mvctask.service.impl;

import dev.maxshkodin.mvctask.model.Appointment;
import dev.maxshkodin.mvctask.repository.AppointmentRepository;
import dev.maxshkodin.mvctask.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class AppointmentServiceImpl implements AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;

    @Override
    public Appointment add(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    @Override
    public Appointment update(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    @Override
    public Appointment getById(int id) {
        return  appointmentRepository.getOne(id);
    }


}
