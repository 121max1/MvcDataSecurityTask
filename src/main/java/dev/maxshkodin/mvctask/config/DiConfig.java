package dev.maxshkodin.mvctask.config;

import dev.maxshkodin.mvctask.repository.ClientRepository;
import dev.maxshkodin.mvctask.service.*;
import dev.maxshkodin.mvctask.service.impl.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DiConfig {
    @Bean
    public ClientService clientService(){
        return new ClientServiceImpl();
    }

    /*
    @Bean
    public UserService userService(){
        return new UserServiceImpl();
    }
     */

    @Bean
    public DoctorService doctorService(){
        return new DoctorServiceImpl();

    }

    @Bean
    public AppointmentService appointmentService(){
        return new AppointmentServiceImpl();
    }

    @Bean
    public  RecordService recordService(){
        return new RecordServiceImpl();
    }
}
