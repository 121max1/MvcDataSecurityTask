package dev.maxshkodin.mvctask.service;

import dev.maxshkodin.mvctask.model.Client;
import dev.maxshkodin.mvctask.model.Doctor;
import dev.maxshkodin.mvctask.model.Record;
import dev.maxshkodin.mvctask.model.Speciality;

import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;


public interface RecordService {

    List<GregorianCalendar> GetFreeGapsByDoctorOnDay(Doctor doctor, GregorianCalendar date);

    List<GregorianCalendar> GetFreeGapsByDoctorOnWeek(Doctor doctor, GregorianCalendar dateFrom);

    Map<Doctor,List<GregorianCalendar>> GetFreeGapsByDoctorTypeOnDay(Speciality speciality, GregorianCalendar date);

    Map<Doctor,List<GregorianCalendar>> GetFreeGapsByDoctorTypeOnWeek(Speciality speciality, GregorianCalendar dateFrom);

    List<Record> GetFutureRecordsByClient(Client client);

    Record add(Record record);

    void delete(Record record);

    List<Record> getRecordsByClient(Client client);

}
