package com.cpadilla.rickAndMorty.persistence.mapper;

import com.cpadilla.rickAndMorty.domain.CharacterDom;
import com.cpadilla.rickAndMorty.persistence.entity.CharacterEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface CharacterMapper {

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "species", target = "species"),
            @Mapping(source = "image", target = "image"),
    })
    CharacterDom toCharacter(CharacterEntity characterEntity);

    CharacterEntity toChaCharacterEntity(CharacterDom character);
}
