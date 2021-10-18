package com.example.architecturespring.repositorie;

import com.example.architecturespring.model.TypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeRepositorie extends JpaRepository<TypeEntity,Long>
{
}