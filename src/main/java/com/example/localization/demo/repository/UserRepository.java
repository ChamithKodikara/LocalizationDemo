package com.example.localization.demo.repository;

import com.example.localization.demo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Chamith
 */
public interface UserRepository extends JpaRepository<User, Long> {

//    @Query("select u from User u where u.name = :name")
//    User findByName(@Param("name") String name);
}
