package org.example.repository;

import org.example.classes.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoginRepository extends JpaRepository<Login, Integer> {
    List<Login> getLoginByUsername(String username);

    Login getLoginByUsernameAndPassword(String username, String password);
}
