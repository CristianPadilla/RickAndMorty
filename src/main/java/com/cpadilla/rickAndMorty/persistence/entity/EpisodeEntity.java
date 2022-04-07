package com.cpadilla.rickAndMorty.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "episode")
public class EpisodeEntity {

    @Id
    private Integer id;

    @Column(name = "episode_name")
    private String episodeName;

    @OneToMany(mappedBy = "episodeEntity", cascade = {CascadeType.ALL})
    private List<EpisodeCharactersEntity> characters;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEpisodeName() {
        return episodeName;
    }

    public void setEpisodeName(String episodeName) {
        this.episodeName = episodeName;
    }

    public List<EpisodeCharactersEntity> getCharacters() {
        return characters;
    }

    public void setCharacters(List<EpisodeCharactersEntity> characters) {
        this.characters = characters;
    }
}
