package com.iiht.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iiht.bs.model.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Define custom queries or use default JpaRepository methods
}
