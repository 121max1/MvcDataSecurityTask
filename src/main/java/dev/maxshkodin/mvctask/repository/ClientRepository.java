package dev.maxshkodin.mvctask.repository;

import dev.maxshkodin.mvctask.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client,Integer> {

}
