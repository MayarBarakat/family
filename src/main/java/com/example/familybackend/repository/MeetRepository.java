package com.example.familybackend.repository;

import com.example.familybackend.entity.Meet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MeetRepository extends JpaRepository<Meet, Long> {
}
