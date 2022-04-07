package com.cpadilla.rickAndMorty.persistence.mapper;

import com.cpadilla.rickAndMorty.domain.Episode;
import com.cpadilla.rickAndMorty.persistence.entity.EpisodeEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {EpisodeCharacterMapper.class})
public interface EpisodeMapper {

    @Mappings({
            @Mapping(source = "id", target = "episode"),
            @Mapping(source = "episodeName", target = "episodeName"),
            @Mapping(source = "characters", target = "characters")
    })
    Episode toEpisode(EpisodeEntity episodeEntity);

    List<Episode> toEpisodes(List<EpisodeEntity> episodeEntities);
}
