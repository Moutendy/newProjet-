package com.example.architecturespring.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TypeDto
{
    @JsonProperty("id")
    private Long id;

    @JsonProperty("libelle")
    private String libelle;

}
