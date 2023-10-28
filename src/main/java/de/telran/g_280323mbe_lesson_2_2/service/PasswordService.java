package de.telran.g_280323mbe_lesson_2_2.service;

public class PasswordService {
    public boolean isPasswordCorrect(String password) {
        return password.length() >=3;
    }
}
