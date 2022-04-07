package com.cpadilla.rickAndMorty.domain.service;

import com.cpadilla.rickAndMorty.domain.Episode;
import com.cpadilla.rickAndMorty.domain.repository.IEpisodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EpisodeService {

    @Autowired
    private IEpisodeRepository episodeRepository;

    public List<Episode> getAll() {
        return episodeRepository.getAll();
    }

    public Optional<Episode> getEpisode(int episode) {
        return episodeRepository.getEpisode(episode);
    }


}
