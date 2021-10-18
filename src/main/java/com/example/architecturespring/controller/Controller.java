package com.example.architecturespring.controller;

import com.example.architecturespring.dto.TypeDto;
import com.example.architecturespring.services.IServicesTypes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class Controller
{


    @Autowired
     IServicesTypes iServicesTypes;

    @GetMapping("/afficher")
    public Collection<TypeDto> afficher()
    {
        Collection<TypeDto> dtos= iServicesTypes.getTypes();
        return dtos;
    }

    @PostMapping("/ajouter")
    public void ajouter(@RequestBody TypeDto dtoTYpe)
    {
       iServicesTypes.createType(dtoTYpe);
    }
    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable Long id)
    {
        iServicesTypes.deleteType(id);
    }
    @PatchMapping("/miseAjour/{id}")
    public void update(@RequestBody TypeDto type, @PathVariable Long id)
    {
        iServicesTypes.updateType(id,type);
    }
}
