package org.shark.example.dao.repository;

import org.shark.example.dao.repository.pojo.UserDo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserDo, Integer> {

}
