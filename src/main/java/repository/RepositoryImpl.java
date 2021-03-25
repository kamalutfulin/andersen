package repository;

import model.User;

import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class RepositoryImpl implements Repo{
    @Override
    public List<User> getAll() {
        return null;
    }
}
