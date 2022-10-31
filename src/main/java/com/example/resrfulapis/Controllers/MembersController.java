package com.example.resrfulapis.Controllers;

import com.example.resrfulapis.Models.Members;
import com.example.resrfulapis.Service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("v1/apis")
public class MembersController {

    @Autowired
    private MemberService service;

    @GetMapping("/members")
    public List<Members> getmembers(){
        return service.getMembers();
    }

    @PostMapping("addmembers")
    public int addMember(@RequestBody Members members){
        service.addmember(members);
        return members.getId();
    }
    @PutMapping("updatemembers/{id}")
    public void updatemember(@PathVariable("id") Integer id, @RequestBody Members members){
        service.updatemember(members);
    }

    @DeleteMapping("deletemember")
    public void deletemember(@PathVariable("id") Members members){

    }
}
