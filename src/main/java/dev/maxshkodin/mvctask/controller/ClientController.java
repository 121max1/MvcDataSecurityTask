package dev.maxshkodin.mvctask.controller;

import dev.maxshkodin.mvctask.model.Client;
import dev.maxshkodin.mvctask.service.ClientService;
import dev.maxshkodin.mvctask.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ClientController {

    @Autowired
    private ClientService clientService;

    @Autowired
    private UserService userService;

    @RequestMapping(value="/clients", method=RequestMethod.GET)
    public String getOrderPage(Model model) {
        model.addAttribute("clientList",clientService.getAll());
        return "clients";
    }

    @RequestMapping(value="/register/client", method=RequestMethod.GET)
    public String getClientRegistrationPage(Model model) {
        return "clientRegistration";
    }

    @RequestMapping(value="/register/register-new-client", method=RequestMethod.POST)
    public String addNewClient(@RequestParam(value="fullName") String fullName,
                               @RequestParam(value="phoneNumber") String phoneNumber,
                               @RequestParam(value="email") String email,
                               @RequestParam(value="login") String login,
                               @RequestParam(value="password") String password) throws Exception {
        Client client = new Client(fullName,phoneNumber,email,login,password);
        userService.registerUser(client,false);
        return "redirect:/";
    }

    @RequestMapping(value="update/update-client", method=RequestMethod.POST)
    public String updateClient(@RequestParam(value="id") Integer id,
                               @RequestParam(value="fullName") String fullName,
                               @RequestParam(value="phoneNumber") String phoneNumber,
                               @RequestParam(value="email") String email,
                               @RequestParam(value="login") String login,
                               @RequestParam(value="password") String password) {
        Client clientToUpdate = new Client(fullName,phoneNumber,email,login,password);
        clientToUpdate.setId(id);
        clientService.update(clientToUpdate);
        return "redirect:/";
    }

    @RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
    public String deleteItem(@PathVariable Integer id) {
        clientService.delete(id);
        return "redirect:/";
    }
    @RequestMapping(value="/update/{id}", method=RequestMethod.GET)
    public String updateItem(@PathVariable Integer id, Model model) {
        Client client = clientService.getById(id);
        Client _client = new Client(client.getFullName(),client.getPhoneNumber(),client.getEmail(),client.getLogin(),client.getPassword());
        _client.setId(client.getId());
        model.addAttribute("client",_client);
        return "clientUpdate";
    }



}
