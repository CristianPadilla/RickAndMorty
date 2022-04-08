package com.cpadilla.rickAndMorty.persistence.mapper;

import com.cpadilla.rickAndMorty.domain.CharacterDom;
import com.cpadilla.rickAndMorty.persistence.entity.CharacterEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CharacterMapper {

    @Mappings({
//            @Mapping(source = "id", target = "id"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "species", target = "species"),
            @Mapping(source = "image", target = "image"),
            @Mapping(source = "gender", target = "gender"),
    })
    CharacterDom toCharacter(CharacterEntity characterEntity);

    List<CharacterDom> toCharacters(List<CharacterEntity> characterEntities);



    CharacterEntity toChaCharacterEntity(CharacterDom character);
}
