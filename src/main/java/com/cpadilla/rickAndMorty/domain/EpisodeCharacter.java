package com.cpadilla.rickAndMorty.domain;

public class EpisodeCharacter {

    private int characterId;

    private CharacterDom character;

    public int getCharacterId() {
        return characterId;
    }

    public void setCharacterId(int characterId) {
        this.characterId = characterId;
    }

    public CharacterDom getCharacter() {
        return character;
    }

    public void setCharacter(CharacterDom character) {
        this.character = character;
    }
}
