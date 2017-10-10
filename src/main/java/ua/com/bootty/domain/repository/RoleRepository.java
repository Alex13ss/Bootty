package ua.com.bootty.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.bootty.domain.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}
