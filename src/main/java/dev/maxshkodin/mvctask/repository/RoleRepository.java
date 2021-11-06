package dev.maxshkodin.mvctask.repository;

import dev.maxshkodin.mvctask.model.Role;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RoleRepository extends CrudRepository<Role, Long> {
    Optional<Role> findByName(String roleName);
}
