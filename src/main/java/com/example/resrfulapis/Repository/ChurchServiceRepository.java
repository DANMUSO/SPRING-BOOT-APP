package com.example.resrfulapis.Repository;

import com.example.resrfulapis.Models.ChurchServices;
import com.example.resrfulapis.Service.ChurchService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChurchServiceRepository extends JpaRepository<ChurchServices, Integer> {
}
