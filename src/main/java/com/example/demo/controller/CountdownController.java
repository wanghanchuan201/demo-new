package com.example.demo.controller;

import com.example.demo.entity.Countdown;
import com.example.demo.repository.CountdownRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/countdowns")
public class CountdownController {

    @Autowired
    private CountdownRepository countdownRepository;

    @GetMapping
    public List<Countdown> getAll() {
        return countdownRepository.findAll();
    }

    @PostMapping
    public Countdown add(@RequestBody Countdown countdown) {
        return countdownRepository.save(countdown);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        countdownRepository.deleteById(id);
    }
}
