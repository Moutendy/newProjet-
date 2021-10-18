package com.example.architecturespring.services;

import com.example.architecturespring.dto.TypeDto;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public interface IServicesTypes {
     void createType(TypeDto dtoType);
      void updateType(Long id, TypeDto dtoType);
   void deleteType(Long id);
     Collection<TypeDto> getTypes();
}
