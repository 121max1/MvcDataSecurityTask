package dev.maxshkodin.mvctask.repository;

import dev.maxshkodin.mvctask.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor,Integer> {


}
