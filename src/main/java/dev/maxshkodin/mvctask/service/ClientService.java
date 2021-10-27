package dev.maxshkodin.mvctask.service;


import dev.maxshkodin.mvctask.model.Client;

import java.util.List;

public interface ClientService {

    Client add(Client client);

    void delete(int id);

    Client update(Client client);

    Client getById(int id);

    List<Client> getAll();

}
