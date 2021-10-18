package com.example.architecturespring.mapper;

import com.example.architecturespring.dto.TypeDto;
import com.example.architecturespring.model.TypeEntity;
import org.dozer.DozerBeanMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class MapType
{
    DozerBeanMapper mapper= new DozerBeanMapper();


    //conversion entite en dto
    public TypeDto conversionEntiteDto(TypeEntity type)
    {
        TypeDto dtoType=mapper.map(type, TypeDto.class);

        return dtoType;

    }

    //conversion dto en entite
    public TypeEntity conversionDtoEntite(TypeDto dtoTYpe)
    {
        TypeEntity type=mapper.map(dtoTYpe, TypeEntity.class);

        return type;
    }

    //conversion entites en dtos
    public List<TypeDto> afficher(List<TypeEntity> tp)
    { List<TypeDto> dtos=new ArrayList<TypeDto>();

        for(TypeEntity type:tp)
        {
        TypeDto dtoTYpe = conversionEntiteDto(type);
        dtos.add(dtoTYpe);

        }
        return dtos;
    }

   //mapping id
    public TypeEntity idmapper(Long id)
    {
        TypeEntity type=new TypeEntity();
        TypeDto dtoTYpe=new TypeDto();
        dtoTYpe.setId(id);
        type.setId(dtoTYpe.getId());

        return type;
    }
}
