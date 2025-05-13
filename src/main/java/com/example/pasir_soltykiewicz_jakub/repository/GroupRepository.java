package com.example.pasir_soltykiewicz_jakub.repository;

import com.example.pasir_soltykiewicz_jakub.model.Group;
import com.example.pasir_soltykiewicz_jakub.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GroupRepository extends JpaRepository<Group, Long> {
    List<Group> findByMemberships_User(User user);
}
