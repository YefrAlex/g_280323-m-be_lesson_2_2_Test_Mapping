package de.telran.g_280323mbe_lesson_2_2.service;

import de.telran.g_280323mbe_lesson_2_2.domen.entity.User;

import java.util.List;

public interface UserService {

    List<User> getAll();
    User getByName(String name);
    void add(User user);
}
