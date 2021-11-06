package dev.maxshkodin.mvctask.service;

import dev.maxshkodin.mvctask.model.Appointment;
import org.springframework.stereotype.Service;

@Service
public interface AppointmentService{

    Appointment add(Appointment appointment);

    Appointment update(Appointment appointment);

    Appointment getById(int id);

}
