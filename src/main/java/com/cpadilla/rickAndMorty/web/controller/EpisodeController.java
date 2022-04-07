package com.cpadilla.rickAndMorty.web.controller;

import com.cpadilla.rickAndMorty.domain.Episode;
import com.cpadilla.rickAndMorty.domain.service.EpisodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/episodes")
public class EpisodeController {

    @Autowired
    private EpisodeService episodeService;

    @GetMapping("/all")
    public ResponseEntity<List<Episode>> getAll() {
        return new ResponseEntity<>(episodeService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{episode}")
    public ResponseEntity<Episode> getEpisode(@PathVariable("episode") int episode) {
        return episodeService.getEpisode(episode).map(episode1 -> new ResponseEntity<>(episode1, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
