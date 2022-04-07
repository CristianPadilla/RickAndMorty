package com.cpadilla.rickAndMorty.persistence.mapper;

import com.cpadilla.rickAndMorty.domain.EpisodeCharacter;
import com.cpadilla.rickAndMorty.persistence.entity.EpisodeCharactersEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface EpisodeCharacterMapper {

    @Mappings({
            @Mapping(source = "id.characterId", target = "characterId")
    })
    EpisodeCharacter toEpisodeCharacter(EpisodeCharactersEntity episodeCharactersEntity);

    @InheritInverseConfiguration
    @Mappings({
            @Mapping(target = "id.episodeId", ignore = true),
            @Mapping(target = "episodeEntity", ignore = true),
            @Mapping(target = "characterEntity", ignore = true)
    })
    EpisodeCharactersEntity toEpisodeCharactersEntity(EpisodeCharacter episodeCharacter);

}
