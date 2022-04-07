package com.cpadilla.rickAndMorty.persistence.crud;

import com.cpadilla.rickAndMorty.persistence.entity.EpisodeEntity;
import org.springframework.data.repository.CrudRepository;

public interface EpisodeCrudRepository extends CrudRepository<EpisodeEntity, Integer> {
}
