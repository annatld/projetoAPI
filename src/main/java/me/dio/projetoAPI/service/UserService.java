package me.dio.projetoAPI.service;

import me.dio.projetoAPI.domian.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}