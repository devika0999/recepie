package com.nestdigital.recepie_backend.controller;

import com.nestdigital.recepie_backend.dao.RecepieDao;
import com.nestdigital.recepie_backend.model.RecepieModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RecepieController {


    @Autowired
    private RecepieDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addrecepie",consumes = "application/json", produces = "application/json")
    public String AddRecepie(@RequestBody RecepieModel recepie)
    {
       dao.save(recepie);
       return "{status:'success'}";
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/viewrecepie")
    public List<RecepieModel> ViewRecepie()
    {
        return (List<RecepieModel>)dao.findAll();
    }

}
