package repository;

import model.User;

import java.util.List;

public interface Repo {
    List<User> getAll();
}
