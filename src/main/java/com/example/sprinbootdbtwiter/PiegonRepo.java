package com.example.sprinbootdbtwiter;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PiegonRepo extends JpaRepository<Pigeon, Long> {



}
