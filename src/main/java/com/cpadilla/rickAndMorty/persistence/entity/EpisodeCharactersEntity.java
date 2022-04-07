package com.cpadilla.rickAndMorty.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "episode_characters")
public class EpisodeCharactersEntity {

    @EmbeddedId //composed PK
    private EpisodeCharactersPKEntity id;

    @ManyToOne
    @JoinColumn(name = "character_id", insertable = false, updatable = false)
    private CharacterEntity characterEntity;


    @ManyToOne
    @MapsId("id")
    @JoinColumn(name = "episode_id", insertable = false, updatable = false)
    private EpisodeEntity episodeEntity;


    public EpisodeCharactersPKEntity getId() {
        return id;
    }

    public void setId(EpisodeCharactersPKEntity id) {
        this.id = id;
    }

    public CharacterEntity getCharacterEntity() {
        return characterEntity;
    }

    public void setCharacterEntity(CharacterEntity characterEntity) {
        this.characterEntity = characterEntity;
    }

    public EpisodeEntity getEpisodeEntity() {
        return episodeEntity;
    }

    public void setEpisodeEntity(EpisodeEntity episodeEntity) {
        this.episodeEntity = episodeEntity;
    }
}
