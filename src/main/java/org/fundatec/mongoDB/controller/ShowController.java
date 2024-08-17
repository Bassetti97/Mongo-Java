package org.fundatec.mongoDB.controller;

import org.fundatec.mongoDB.model.Show;
import org.fundatec.mongoDB.repository.ShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/shows")
public class ShowController {

    @Autowired
    private ShowRepository showRepository;

    @PostMapping
    public ResponseEntity<Show> addShow(@RequestBody Show show) {
        Show savedShow = showRepository.save(show);
        return new ResponseEntity<>(savedShow, HttpStatus.CREATED);
    }

    @GetMapping
    public List<Show> getAllShows() {
        return showRepository.findAll();
    }
}
