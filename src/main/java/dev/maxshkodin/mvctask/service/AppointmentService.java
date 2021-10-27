package dev.maxshkodin.mvctask.service;

import dev.maxshkodin.mvctask.model.Appointment;

public interface AppointmentService{

    Appointment add(Appointment appointment);

    Appointment update(Appointment appointment);

    Appointment getById(int id);

}
