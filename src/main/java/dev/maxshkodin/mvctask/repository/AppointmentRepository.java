package dev.maxshkodin.mvctask.repository;

import dev.maxshkodin.mvctask.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepository  extends JpaRepository<Appointment,Integer> {
}
