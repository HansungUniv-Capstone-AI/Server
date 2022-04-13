package com.example.capstonewas.repository;

import com.example.capstonewas.model.Member;
import com.pet.comes.model.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OuthRepository extends JpaRepository<Member,Long> {

    Member findByEmail(String email);

    void deleteByEmail(String email);
}
