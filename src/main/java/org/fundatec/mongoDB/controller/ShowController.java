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
    public Show addShow(@RequestBody Show show) {
        return showRepository.save(show);
    }

    @GetMapping
    public List<Show> getAllShows() {
        return showRepository.findAll();
    }
}
