package com.example.resrfulapis.Controllers;

import com.example.resrfulapis.Models.ChurchServices;
import com.example.resrfulapis.Service.ChurchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("v1/apis")
public class ChurchServiceController {

    @Autowired
    private ChurchService churchService;

    @GetMapping("/services")
    public List<ChurchServices> getService(){
        return churchService.getService();
    }

    @PostMapping("/addservice")
    public int addService(@RequestBody ChurchServices churchServices){
        churchService.addService(churchServices);
        return churchServices.getId();
    }

    @PutMapping("/updateservice/{id}")
    public void updateService(@PathVariable("id") Integer id, @RequestBody ChurchServices churchServices ){
        churchService.updateService(churchServices);
    }

    @DeleteMapping("/deleteservice")
    public void delete(@PathVariable("id") ChurchServices churchServices)
    {

    }

}
