package com.cpadilla.rickAndMorty.domain;

import javax.persistence.CascadeType;
import java.util.List;

public class Episode {

    private int episode;
    private String episodeName;
    private List<CharacterDom> characters;

    public int getEpisode() {
        return episode;
    }

    public void setEpisode(int episode) {
        this.episode = episode;
    }

    public String getEpisodeName() {
        return episodeName;
    }

    public void setEpisodeName(String episodeName) {
        this.episodeName = episodeName;
    }

    public List<CharacterDom> getCharacters() {
        return characters;
    }

    public void setCharacters(List<CharacterDom> characters) {
        this.characters = characters;
    }
}
