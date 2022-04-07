package com.cpadilla.rickAndMorty.persistence;

import com.cpadilla.rickAndMorty.domain.Episode;
import com.cpadilla.rickAndMorty.domain.repository.IEpisodeRepository;
import com.cpadilla.rickAndMorty.persistence.crud.EpisodeCrudRepository;
import com.cpadilla.rickAndMorty.persistence.entity.EpisodeEntity;
import com.cpadilla.rickAndMorty.persistence.mapper.EpisodeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class EpisodeRepository implements IEpisodeRepository {

    @Autowired
    private EpisodeCrudRepository episodeCrudRepository;

    @Autowired
    private EpisodeMapper mapper;

    @Override
    public List<Episode> getAll() {
        return mapper.toEpisodes((List<EpisodeEntity>) episodeCrudRepository.findAll());
    }

    @Override
    public Optional<Episode> getEpisode(int episode) {
        return episodeCrudRepository.findById(episode)
                .map(episodeEntity -> mapper.toEpisode(episodeEntity));
    }
}
