package ua.com.bootty.service;

import ua.com.bootty.domain.model.User;

public interface UserService {

    void save(User user);

    User findByUsername(String login);

}
