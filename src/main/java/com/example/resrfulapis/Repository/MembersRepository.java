package com.example.resrfulapis.Repository;

import com.example.resrfulapis.Models.Members;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MembersRepository extends JpaRepository<Members, Integer> {
}
