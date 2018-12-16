package com.alextotheroh.bluesGuitarRiffsAiApi.controllers;

import com.alextotheroh.bluesGuitarRiffsAiApi.models.RiffsResponse;
import com.alextotheroh.bluesGuitarRiffsAiApi.models.RunGeneticAlgoRequest;
import com.alextotheroh.bluesGuitarRiffsAiApi.services.RiffGeneticAlgoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    RiffGeneticAlgoService riffGeneticAlgoService;

    public MainController(RiffGeneticAlgoService riffGeneticAlgoService) {
        this.riffGeneticAlgoService = riffGeneticAlgoService;
    }

    @GetMapping("/healthcheck")
    public String healthcheck() {
        return "OK";
    }

    @PostMapping("/runGeneticAlgoForParams")
    public RiffsResponse runGeneticAlgoForParams(@RequestBody RunGeneticAlgoRequest req) {
        return riffGeneticAlgoService.runForParams(req);
    }

}
