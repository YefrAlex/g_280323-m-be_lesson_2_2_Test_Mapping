package de.telran.g_280323mbe_lesson_2_2.domen.database;

import de.telran.g_280323mbe_lesson_2_2.domen.entity.CommonUser;
import de.telran.g_280323mbe_lesson_2_2.domen.entity.User;

import java.util.ArrayList;
import java.util.List;

public class SimpleDatabase implements Database{
    List<User> users = new ArrayList<>();
    public SimpleDatabase () {
        users.add(new CommonUser("Vanya", "qwe"));
        users.add(new CommonUser("Petya", "asd"));
        users.add(new CommonUser("Sidor", "zxc"));
        users.add(new CommonUser("Kuzma", "qaz"));
    }
    @Override
    public void execute(String query) {
           String[] parts = query.split(" ");
           users.add(new CommonUser(parts[1], parts[2]));
    }

    @Override
    public List<User> select(String query) {
        String[] parts = query.split(" ");
        if (parts[1].equals("all")){
            return users;
        }
        else {
            List<User> result = new ArrayList<>();
            for (User user : users) {
                if (user.getName().equals(parts[1])) {
                    result.add(user);
                    return result;
                }
            }
        }
        return null;
    }
}
