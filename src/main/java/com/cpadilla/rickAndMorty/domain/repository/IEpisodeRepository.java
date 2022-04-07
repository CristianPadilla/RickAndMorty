package com.cpadilla.rickAndMorty.domain.repository;

import com.cpadilla.rickAndMorty.domain.Episode;

import java.util.List;
import java.util.Optional;

public interface IEpisodeRepository {

    List<Episode> getAll();

    Optional<Episode> getEpisode(int episode);
}
