package dev.maxshkodin.mvctask.service;


import dev.maxshkodin.mvctask.model.Client;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClientService {

    Client add(Client client);

    void delete(int id);

    Client update(Client client);

    Client getById(int id);

    List<Client> getAll();

}
