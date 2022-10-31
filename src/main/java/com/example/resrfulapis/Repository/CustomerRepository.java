package com.example.resrfulapis.Repository;

import com.example.resrfulapis.Models.Customerrs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customerrs, Integer> {
}
