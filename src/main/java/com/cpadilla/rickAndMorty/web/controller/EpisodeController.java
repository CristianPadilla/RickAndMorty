package com.cpadilla.rickAndMorty.web.controller;

import com.cpadilla.rickAndMorty.domain.Episode;
import com.cpadilla.rickAndMorty.domain.service.EpisodeService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/episodes")
public class EpisodeController {

    @Autowired
    private EpisodeService episodeService;

    @GetMapping("/all")
    @ApiOperation("Get an array of all available episodes")
    @ApiResponse(code = 200, message = "OK")
    public ResponseEntity<List<Episode>> getAll() {
        return new ResponseEntity<>(episodeService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{episode}")
    @ApiOperation("Search episode through episode number")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "episode not found")
    })
    public ResponseEntity<Episode> getEpisode(@ApiParam(value = "episode number", required = true, example = "10")
                                              @PathVariable("episode") int episode) {
        return episodeService.getEpisode(episode).map(episode1 -> new ResponseEntity<>(episode1, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
