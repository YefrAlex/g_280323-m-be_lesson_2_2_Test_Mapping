package de.telran.g_280323mbe_lesson_2_2.domen.entity;

public class CommonUser implements User{
    private String name;
    private String password;

    public CommonUser(String name, String password) {
        this.name=name;
        this.password=password;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "CommonUser{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
