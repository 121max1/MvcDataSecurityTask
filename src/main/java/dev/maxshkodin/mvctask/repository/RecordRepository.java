package dev.maxshkodin.mvctask.repository;

import dev.maxshkodin.mvctask.model.Record;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecordRepository extends JpaRepository<Record,Integer> {

}
