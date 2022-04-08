package com.cpadilla.rickAndMorty.persistence.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "episode")
public class EpisodeEntity {

    @Id
    private Integer id;

    @Column(name = "episode_name")
    private String episodeName;

    @ManyToMany
    @JoinTable(
            name = "episode_characters",
            joinColumns = @JoinColumn(name = "episode_id"),
            inverseJoinColumns = @JoinColumn(name = "character_id")
    )
    private List<CharacterEntity> characters;

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

    public List<CharacterEntity> getCharacters() {
        return characters;
    }

    public void setCharacters(List<CharacterEntity> characters2) {
        this.characters = characters2;
    }
}
