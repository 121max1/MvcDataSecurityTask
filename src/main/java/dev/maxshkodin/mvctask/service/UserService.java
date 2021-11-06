package dev.maxshkodin.mvctask.service;

import dev.maxshkodin.mvctask.model.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public interface UserService extends UserDetailsService {

    public void registerUser(User user, boolean isAdmin) throws  Exception;

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
}
