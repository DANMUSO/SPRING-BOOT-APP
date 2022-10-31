package com.example.resrfulapis.Repository;

import com.example.resrfulapis.Models.Events;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventsRepository extends JpaRepository<Events, Integer> {
}
