package de.telran.g_280323mbe_lesson_2_2.domen.database;

import de.telran.g_280323mbe_lesson_2_2.domen.entity.User;

import java.util.List;

public interface Database {

    void execute (String query);

    List<User> select (String query);

}
