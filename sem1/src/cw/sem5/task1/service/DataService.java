package cw.sem5.task1.service;

import cw.sem5.task1.model.User;

import java.util.List;

public interface DataService {
    User create(User user);
    List<User> read();
}
