package com.example.resrfulapis.Service;

import com.example.resrfulapis.Models.ChurchServices;
import com.example.resrfulapis.Repository.ChurchServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChurchService {

    @Autowired
    private ChurchServiceRepository churchServiceRepository;

    public List<ChurchServices> getService(){
        return churchServiceRepository.findAll();
    }

    public void addService(ChurchServices churchService){
        churchServiceRepository.save(churchService);
    }

    public  void updateService(ChurchServices churchService){
        churchServiceRepository.save(churchService);
    }
    public void deleteService(Integer id){
        churchServiceRepository.deleteById(id);
    }

}
