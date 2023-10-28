package de.telran.g_280323mbe_lesson_2_2.repository;

import de.telran.g_280323mbe_lesson_2_2.domen.database.Database;
import de.telran.g_280323mbe_lesson_2_2.domen.database.SimpleDatabase;
import de.telran.g_280323mbe_lesson_2_2.domen.entity.CommonUser;
import de.telran.g_280323mbe_lesson_2_2.domen.entity.User;

import java.util.List;

public class CommonUserRepository implements UserRepository{
    private Database database = new SimpleDatabase();

    @Override
    public List<User> getAll() {
        return database.select("get all");
    }

    @Override
    public List<User> getByName(String name) {
        return database.select("get " + name);
    }

    @Override
    public void addUser(User user) {
        database.execute("add " + user.getName() + " " + user.getPassword());
    }


    public static void main(String[] args) {
        CommonUserRepository cur = new CommonUserRepository();
        System.out.println(cur.getAll());
    }



}
