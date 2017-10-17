package ua.com.bootty.domain.repository;

import org.springframework.data.repository.CrudRepository;
import ua.com.bootty.domain.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {

    User getUserByLogin(String login);

}
