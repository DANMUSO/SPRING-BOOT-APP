package com.example.resrfulapis.Service;

import com.example.resrfulapis.Models.Members;
import com.example.resrfulapis.Repository.MembersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {

    @Autowired
    private MembersRepository repo;

    public List<Members> getMembers(){
        return repo.findAll();
    }

    public void addmember(Members members){
        repo.save(members);
    }

    public void updatemember(Members members){
        repo.save(members);
    }

    public void deletememberr(Integer id){
        repo.deleteById(id);
    }
}
