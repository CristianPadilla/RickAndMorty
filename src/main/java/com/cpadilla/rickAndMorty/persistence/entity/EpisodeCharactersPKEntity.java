package com.cpadilla.rickAndMorty.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class EpisodeCharactersPKEntity implements Serializable {

    @Column(name = "character_id")
    private Integer characterId;

    @Column(name = "episode_id")
    private Integer episodeId;

    public Integer getCharacterId() {
        return characterId;
    }

    public void setCharacterId(Integer characterId) {
        this.characterId = characterId;
    }

    public Integer getEpisodeId() {
        return episodeId;
    }

    public void setEpisodeId(Integer episodeId) {
        this.episodeId = episodeId;
    }
}
