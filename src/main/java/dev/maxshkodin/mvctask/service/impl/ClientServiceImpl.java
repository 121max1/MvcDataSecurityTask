package dev.maxshkodin.mvctask.service.impl;


import dev.maxshkodin.mvctask.model.Client;
import dev.maxshkodin.mvctask.repository.ClientRepository;
import dev.maxshkodin.mvctask.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public Client add(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public void delete(int id) {
        clientRepository.delete(id);
    }

    @Override
    public Client update(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client getById(int id) {
        return clientRepository.getOne(id);
    }

    @Override
    public List<Client> getAll() {
        return clientRepository.findAll();
    }
}
