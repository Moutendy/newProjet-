package com.example.architecturespring.services;

import com.example.architecturespring.dto.TypeDto;
import com.example.architecturespring.mapper.MapType;
import com.example.architecturespring.model.TypeEntity;
import com.example.architecturespring.repositorie.TypeRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class ImpleServices implements IServicesTypes{

   @Autowired
    TypeRepositorie typeRepositorie;

    @Autowired
   MapType mapType;


    @Override
    public void createType(TypeDto dtotype)
    {
        typeRepositorie.save(mapType.conversionDtoEntite(dtotype));
    }

    @Override
    public void updateType(Long id, TypeDto dtotype)
    {
        if(typeRepositorie.existsById(id))
        {
            typeRepositorie.save(mapType.conversionDtoEntite(dtotype));
        }

    }

    @Override
    public void deleteType(Long id)
    {
        if(typeRepositorie.existsById(id))
        {
            typeRepositorie.delete(mapType.idmapper(id));
        }
    }

    @Override
    public Collection<TypeDto> getTypes()
    {
        List<TypeEntity> types=typeRepositorie.findAll();
        List<TypeDto> dtos=mapType.afficher(types);
        return dtos;
    }
}
