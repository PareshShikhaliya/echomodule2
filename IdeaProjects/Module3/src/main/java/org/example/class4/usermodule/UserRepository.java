package org.example.class4.usermodule;

public interface UserRepository {
    User findById(int id);
    void save(User user);
    void update(User user);
    void delete(int id);
}

